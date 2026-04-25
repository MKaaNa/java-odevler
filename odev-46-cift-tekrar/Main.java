public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,5,6,4,8,6,10,10,11,12,12};
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val % 2 != 0) continue;
            boolean already = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == val) { already = true; break; }
            }
            if (already) continue;
            int count = 0;
            for (int v : arr) {
                if (v == val) count++;
            }
            if (count > 1) {
                System.out.print(val + " ");
            }
        }
        System.out.println();
    }
}
