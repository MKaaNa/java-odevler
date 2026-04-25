import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        if (original == reversed) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Degil");
        }
    }
}
