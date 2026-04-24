public class Elmas {
    public static void main(String[] args) {
        int height = 5; // üst yarı satır sayısı
        // üst yarı
        for (int i = 1; i <= height; i++) {
            // boşluklar
            for (int s = 0; s < height - i; s++) {
                System.out.print(" ");
            }
            // yıldızlar
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // alt yarı
        for (int i = height - 1; i >= 1; i--) {
            for (int s = 0; s < height - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
