import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) { int tmp = a; a = b; b = tmp; }
        if (a > c) { int tmp = a; a = c; c = tmp; }
        if (b > c) { int tmp = b; b = c; c = tmp; }
        System.out.println(a + " " + b + " " + c);
    }
}
