import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taban = scanner.nextInt();
        int us = scanner.nextInt();
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        System.out.println("Sonuc = " + sonuc + ";");
        scanner.close();
    }
}
