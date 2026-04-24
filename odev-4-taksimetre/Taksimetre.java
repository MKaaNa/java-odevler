import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = scanner.nextDouble();
        double total = 10 + km * 2.20;
        if (total < 20) total = 20;
        System.out.println("Tutar = " + total + " TL;");
        scanner.close();
    }
}
