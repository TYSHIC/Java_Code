import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 獲取資料個數
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt(); // 讀入資料
        // 氣泡排序
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true; // 用於判斷是否要提早結束排序
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交換兩個資料
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false; // 有資料交換，表示須繼續排序
                }
            }
            if (flag) break; // 該輪沒有資料交換，表示排序已提前完成
        }
        System.out.println(Arrays.toString(arr));
    }
}