import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -2147483648, min = 2147483647;
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            if (p > max) max = p;
            if (p < min) min = p;
        }
        System.out.printf("max = %d, min = %d", max, min);
    }
}
