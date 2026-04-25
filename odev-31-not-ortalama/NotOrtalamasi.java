import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dersNotlari = new int[5];
        for (int i = 0; i < 5; i++) {
            dersNotlari[i] = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int not : dersNotlari) {
            if (not >= 0 && not <= 100) {
                sum += not;
                count++;
            }
        }
        double ortalama = count > 0 ? (double) sum / count : 0.0;
        System.out.println("Ortalama: " + ortalama + ";");
        scanner.close();
    }
}
