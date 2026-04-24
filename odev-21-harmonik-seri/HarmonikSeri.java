import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double toplam = 0.0;
        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }
        System.out.println("Harmonik Seri = " + toplam + ";");
        scanner.close();
    }
}
