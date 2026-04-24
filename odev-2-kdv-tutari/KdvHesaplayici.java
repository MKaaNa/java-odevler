import java.util.Scanner;

public class KdvHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tutar = scanner.nextDouble();
        double kdvOrani;
        if (tutar > 0 && tutar <= 1000) {
            kdvOrani = 0.18;
        } else if (tutar > 1000) {
            kdvOrani = 0.08;
        } else {
            kdvOrani = 0.0;
        }
        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;
        System.out.println("KDV'siz Fiyat = " + tutar + ";");
        System.out.println("KDV'li Fiyat = " + kdvliFiyat + ";");
        System.out.println("KDV tutarı = " + kdvTutari + ";");
        scanner.close();
    }
}
