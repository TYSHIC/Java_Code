public class Main3 {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 1) continue;
                if (j == 4) {
                    System.out.println();
                    continue label;
                }
                System.out.printf("%c%d ", 65 + i, j);
            }
            System.out.println();
        }
    }
}
