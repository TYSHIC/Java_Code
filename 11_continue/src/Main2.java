public class Main2 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 1) continue;
                System.out.printf("%c%d ", 65 + i, j);
            }
            System.out.println();
        }
    }
}
