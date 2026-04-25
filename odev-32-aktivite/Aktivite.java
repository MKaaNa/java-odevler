import java.util.Scanner;

public class Aktivite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sicaklik = scanner.nextInt();
        // if-else chain
        if (sicaklik < 5) {
            System.out.println("Kayak");
        } else if (sicaklik <= 15) {
            System.out.println("Sinema");
        } else if (sicaklik <= 25) {
            System.out.println("Piknik");
        } else {
            System.out.println("Yuzme");
        }
        scanner.close();
    }
}
