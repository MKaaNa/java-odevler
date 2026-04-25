import java.util.Scanner;

public class AsalSayi {
    static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = isPrime(n, 2);
        if (prime) {
            System.out.println(n + " sayısı ASALDIR !");
        } else {
            System.out.println(n + " sayısı ASAL değildir !");
        }
    }
}
