import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // 將資料讀入變數 a, b
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.printf("BEFORE swap: a = %d, b = %d %n", a, b);
        // 交換資料
        int tmp = a;
        a = b;
        b = tmp;
        System.out.printf("AFTER swap: a = %d, b = %d %n", a, b);
    }
}
