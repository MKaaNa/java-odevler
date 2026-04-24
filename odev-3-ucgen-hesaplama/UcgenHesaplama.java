import java.util.Scanner;

public class UcgenHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read two legs for hypotenuse
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double hipotenus = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenus = " + hipotenus + ";");
        // Read three sides for area
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        double u = (a2 + b2 + c2) / 2.0;
        double alan = Math.sqrt(u * (u - a2) * (u - b2) * (u - c2));
        System.out.println("Alan = " + alan + ";");
        scanner.close();
    }
}
