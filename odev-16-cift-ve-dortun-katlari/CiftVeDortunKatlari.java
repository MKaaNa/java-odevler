import java.util.Scanner;

public class CiftVeDortunKatlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        while (true) {
            int sayi = scanner.nextInt();
            if (sayi % 2 != 0) { // odd number ends input
                break;
            }
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }
        System.out.println("Toplam = " + toplam + ";");
        scanner.close();
    }
}
