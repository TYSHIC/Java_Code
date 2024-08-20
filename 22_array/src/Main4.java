public class Main4 {
    public static void main(String[] args) {
        int[][] arr = {{2, 1, 4}, {7, 4}, {8, 3, 6, 4}, {7}};
        for (int[] subArr : arr) {
            for (int e : subArr) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
