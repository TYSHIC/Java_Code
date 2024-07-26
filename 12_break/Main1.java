import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i = 0;
        while (true) {
            if (++i > n) break;
            System.out.println(i);
        }
    }
}
