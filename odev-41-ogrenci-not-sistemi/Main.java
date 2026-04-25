import java.util.Scanner;

class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int oralNote;
    double oralWeight;
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.oralNote = 0;
        this.oralWeight = 0.0;
    }
    void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
    void setOral(int note, double weight) {
        this.oralNote = note;
        this.oralWeight = weight;
    }
    void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
    double weightedScore() {
        return this.examNote * (1 - oralWeight) + this.oralNote * oralWeight;
    }
}

class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;
    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }
    void addBulkExamNote(int matNote, int fizikNote, int kimyaNote) {
        if (matNote >= 0 && matNote <= 100) this.mat.examNote = matNote;
        if (fizikNote >= 0 && fizikNote <= 100) this.fizik.examNote = fizikNote;
        if (kimyaNote >= 0 && kimyaNote <= 100) this.kimya.examNote = kimyaNote;
    }
    void calcAverage() {
        double total = mat.weightedScore() + fizik.weightedScore() + kimya.weightedScore();
        this.average = total / 3;
    }
    boolean checkPass() {
        calcAverage();
        return this.average > 55;
    }
    void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.examNote + " Sözlü : " + this.mat.oralNote);
        System.out.println("Fizik Notu : " + this.fizik.examNote + " Sözlü : " + this.fizik.oralNote);
        System.out.println("Kimya Notu : " + this.kimya.examNote + " Sözlü : " + this.kimya.oralNote);
    }
    void isPass() {
        if (this.mat.examNote == 0 || this.fizik.examNote == 0 || this.kimya.examNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = checkPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) System.out.println("Sınıfı Geçti."); else System.out.println("Sınıfta Kaldı.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        mat.setOral(80, 0.2);
        fizik.setOral(90, 0.2);
        kimya.setOral(85, 0.2);
        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 20, 40);
        s1.isPass();
        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40);
        s2.isPass();
    }
}
