public class Main4 {
    public static void main(String[] args) {
        label:
        {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++)
                    System.out.printf("%c%d ", 65 + i, j);
                if (i == 4) break label;
                System.out.println();
            }
            System.out.println("done!");
        }
    }
}
