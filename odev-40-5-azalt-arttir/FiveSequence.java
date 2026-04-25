import java.util.Scanner;

public class FiveSequence {
    static void generate(int current, int original, boolean descending) {
        System.out.print(current + " ");
        if (descending) {
            if (current <= 0) {
                generate(current + 5, original, false);
            } else {
                generate(current - 5, original, true);
            }
        } else {
            if (current == original) {
                return;
            } else {
                generate(current + 5, original, false);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generate(n, n, true);
        System.out.println();
    }
}
