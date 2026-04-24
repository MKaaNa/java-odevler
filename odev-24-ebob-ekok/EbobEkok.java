import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = 1;
        int ebob = 1;
        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
            i++;
        }
        int ekok = (a * b) / ebob;
        System.out.println("EBOB = " + ebob + ";");
        System.out.println("EKOK = " + ekok + ";");
        scanner.close();
    }
}
