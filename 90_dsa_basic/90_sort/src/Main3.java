import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 獲取資料個數
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt(); // 讀入資料
        for (int i = 0; i < n - 1; i++) {
            int min = -1, minIndex = -1;
            for (int j = i; j < n; j++) {
                if (minIndex == -1 || arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = min;
            arr[minIndex] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
