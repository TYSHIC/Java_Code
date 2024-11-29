import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 獲取資料個數
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt(); // 讀入資料
        int target = scanner.nextInt(); // 讀入目標資料

        int l = 0; // 左邊界，目標的最小可能索引值
        int r = n - 1; // 右邊界，目標的最大可能索引值
        while (l <= r) {
            int mid = l - (l - r) / 2; // 取中間的資料
            if (arr[mid] == target) {
                System.out.println("Target Index: " + mid);
                return;
            }
            if (arr[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        System.out.println("Target Insert Index: " + l);
        // 資料應插入的索引值即為左邊界
    }
}