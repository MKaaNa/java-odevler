import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int toplam = 0;
        int n = Math.abs(sayi);
        while (n > 0) {
            toplam += n % 10;
            n /= 10;
        }
        System.out.println("Toplam = " + toplam + ";");
        scanner.close();
    }
}
