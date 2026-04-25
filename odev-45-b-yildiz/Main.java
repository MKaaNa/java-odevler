public class Main {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    System.out.print(" * ");
                } else if (j == 0) {
                    System.out.print(" * ");
                } else if ((i < 3 && j == 3) || (i > 3 && j == 3)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
