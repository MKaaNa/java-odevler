import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int lower = Integer.MIN_VALUE;
        int higher = Integer.MAX_VALUE;
        for (int n : list) {
            if (n < target && n > lower) lower = n;
            if (n > target && n < higher) higher = n;
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + lower);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + higher);
    }
}
