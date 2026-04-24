import java.util.Scanner;

public class Kuvvetler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        // 4'ün kuvvetleri
        System.out.print("4'ün kuvvetleri: ");
        int val = 1;
        while (val <= limit) {
            System.out.print(val + " ");
            val *= 4;
        }
        System.out.println();
        // 5'in kuvvetleri
        System.out.print("5'in kuvvetleri: ");
        val = 1;
        while (val <= limit) {
            System.out.print(val + " ");
            val *= 5;
        }
        System.out.println();
        scanner.close();
    }
}
