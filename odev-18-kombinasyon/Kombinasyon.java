import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int nFact = 1;
        for (int i = 2; i <= n; i++) {
            nFact *= i;
        }
        int rFact = 1;
        for (int i = 2; i <= r; i++) {
            rFact *= i;
        }
        int nrFact = 1;
        for (int i = 2; i <= n - r; i++) {
            nrFact *= i;
        }
        int kombinasyon = nFact / (rFact * nrFact);
        System.out.println("Kombinasyon = " + kombinasyon + ";");
        scanner.close();
    }
}
