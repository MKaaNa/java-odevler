import java.util.Random;
import java.util.Scanner;

public class Main {
    static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
    static int countAdjacentMines(char[][] hidden, int r, int c) {
        int cnt = 0;
        int rows = hidden.length;
        int cols = hidden[0].length;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int nr = r + i;
                int nc = c + j;
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    if (hidden[nr][nc] == '*') cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        while (true) {
            rows = sc.nextInt();
            cols = sc.nextInt();
            if (rows >= 2 && cols >= 2) break;
            System.out.println("Lütfen 2 ve üzeri değer giriniz.");
        }
        int total = rows * cols;
        int mines = total / 4;
        char[][] hidden = new char[rows][cols];
        char[][] display = new char[rows][cols];
        boolean[][] revealed = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                hidden[i][j] = '-';
                display[i][j] = '-';
                revealed[i][j] = false;
            }
        }
        Random rand = new Random();
        int placed = 0;
        while (placed < mines) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            if (hidden[r][c] != '*') {
                hidden[r][c] = '*';
                placed++;
            }
        }
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        int revealedCount = 0;
        while (true) {
            System.out.println("===========================");
            printBoard(display);
            System.out.print("Satır Giriniz : ");
            int r = sc.nextInt();
            System.out.print("Sütun Giriniz : ");
            int c = sc.nextInt();
            if (r < 0 || r >= rows || c < 0 || c >= cols) {
                System.out.println("Geçersiz koordinat. Tekrar deneyiniz.");
                continue;
            }
            if (revealed[r][c]) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin");
                continue;
            }
            if (hidden[r][c] == '*') {
                System.out.println("Game Over!!");
                break;
            }
            int cnt = countAdjacentMines(hidden, r, c);
            display[r][c] = (char)('0' + cnt);
            revealed[r][c] = true;
            revealedCount++;
            if (revealedCount == total - mines) {
                System.out.println("===========================");
                printBoard(display);
                System.out.println("Oyunu Kazandınız !");
                break;
            }
        }
    }
}
