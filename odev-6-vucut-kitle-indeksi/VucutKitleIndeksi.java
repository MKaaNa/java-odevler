import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boy = scanner.nextDouble();
        double kilo = scanner.nextDouble();
        double indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
        scanner.close();
    }
}
