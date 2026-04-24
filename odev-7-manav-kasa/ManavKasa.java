import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armutKg = scanner.nextDouble();
        double elmaKg = scanner.nextDouble();
        double domatesKg = scanner.nextDouble();
        double muzKg = scanner.nextDouble();
        double patlicanKg = scanner.nextDouble();
        double toplam = armutKg * 2.14 + elmaKg * 3.67 + domatesKg * 1.11 + muzKg * 0.95 + patlicanKg * 5.00;
        System.out.println("Toplam Tutar : " + toplam + " TL");
        scanner.close();
    }
}
