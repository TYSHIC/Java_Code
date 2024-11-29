import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 獲取資料個數
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt(); // 讀入資料
        int target = scanner.nextInt(); // 讀入目標資料
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("Not found.");
    }
}
