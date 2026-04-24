import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil = scanner.nextInt();
        boolean artik = (yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0);
        if (artik) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
        scanner.close();
    }
}
