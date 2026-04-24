import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mesafe = scanner.nextInt();
        int yas = scanner.nextInt();
        int tip = scanner.nextInt();
        if (mesafe <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            scanner.close();
            return;
        }
        double normalTutar = mesafe * 0.10;

        if (yas < 12) {
            normalTutar *= 0.5;
        } else if (yas <= 24) {
            normalTutar *= 0.9;
        } else if (yas > 65) {
            normalTutar *= 0.7;
        }
        if (tip == 2) {
            normalTutar *= 0.8;
            normalTutar *= 2;   // round trip
        }
        System.out.println("Toplam Tutar = " + normalTutar + " TL");
        scanner.close();
    }
}
