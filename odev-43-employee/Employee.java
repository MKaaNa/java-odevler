class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax() {
        if (salary < 1000) return 0;
        return salary * 0.03;
    }
    double bonus() {
        if (workHours > 40) return (workHours - 40) * 30;
        return 0;
    }
    double raiseSalary() {
        int years = 2021 - hireYear;
        if (years < 10) return salary * 0.05;
        if (years < 20) return salary * 0.10;
        return salary * 0.15;
    }
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxBonus = salary - tax + bonus;
        double totalSalary = salaryWithTaxBonus + raise;
        return "Adı : " + name + "\n" +
               "Maaşı : " + salary + "\n" +
               "Çalışma Saati : " + workHours + "\n" +
               "Başlangıç Yılı : " + hireYear + "\n" +
               "Vergi : " + tax + "\n" +
               "Bonus : " + bonus + "\n" +
               "Maaş Artışı : " + raise + "\n" +
               "Vergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxBonus + "\n" +
               "Toplam Maaş : " + totalSalary;
    }
    public static void main(String[] args) {
        Employee e = new Employee("kemal", 2000, 45, 1985);
        System.out.println(e.toString());
    }
}
