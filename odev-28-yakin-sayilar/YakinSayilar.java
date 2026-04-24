import java.util.Scanner;

public class YakinSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int nearestSmaller = Integer.MIN_VALUE;
        int nearestLarger = Integer.MAX_VALUE;
        for (int i = 0; i < list.length; i++) {
            int val = list[i];
            if (val < target && val > nearestSmaller) {
                nearestSmaller = val;
            }
            if (val > target && val < nearestLarger) {
                nearestLarger = val;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestLarger);
        scanner.close();
    }
}
