import java.util.Scanner;

public class Uc3Ve4BolunenOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= limit; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        double ortalama = count == 0 ? 0.0 : (double) sum / count;
        System.out.println("Ortalama = " + ortalama + ";");
        scanner.close();
    }
}
