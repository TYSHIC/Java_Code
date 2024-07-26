import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 1;
        while (i <= n) {
            i++;
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}
