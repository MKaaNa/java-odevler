import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double alpha = scanner.nextDouble();
        double pi = 3.14;
        double alan = (pi * r * r * alpha) / 360.0;
        System.out.println("Alan = " + alan + ";");
        scanner.close();
    }
}
