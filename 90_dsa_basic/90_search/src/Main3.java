import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 獲取資料個數
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt(); // 讀入資料
        int target = scanner.nextInt(); // 讀入目標資料
        // 循序搜尋法
        for (int i = 0; i < n; i++) {
            if (arr[i] > target) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }
}
