import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(a[i][j]);
                if (i < rows - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
