import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        int matematik = input.nextInt();

        System.out.print("Fizik notu: ");
        int fizik = input.nextInt();

        System.out.print("Kimya notu: ");
        int kimya = input.nextInt();

        System.out.print("Turkce notu: ");
        int turkce = input.nextInt();

        System.out.print("Tarih notu: ");
        int tarih = input.nextInt();

        System.out.print("Muzik notu: ");
        int muzik = input.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
        String sonuc = ortalama > 60 ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println("Ortalama: " + ortalama);
        System.out.println(sonuc);

        input.close();
    }
}
