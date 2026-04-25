import java.util.Scanner;

public class UsRecursive {
    static long power(int base, int exp) {
        if (exp == 0) return 1L;
        return base * power(base, exp - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        long result = power(base, exp);
        System.out.println("Sonuç : " + result);
    }
}
