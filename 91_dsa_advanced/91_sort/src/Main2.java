import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    // 快速排序法
    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; // 治：若只有一個資料或沒有資料則為排序完成
        // 分：選定一個資料作為基準，將比基準小的資料分為一組，基準外的其餘資料分為另一組
        int pivot = arr[end];
        // 將所有小於基準的資料與前方的資料交換
        int lesserIndex = start - 1;
        for (int i = start; i <= end - 1; i++) {
            if (arr[i] < pivot) {
                lesserIndex++;
                int tmp = arr[lesserIndex];
                arr[lesserIndex] = arr[i];
                arr[i] = tmp;
            }
        }
        // 治：分別排序兩組資料；合：將比基準小的資料、基準、其餘資料依序連接在一起
        int tmp = arr[lesserIndex + 1];
        arr[lesserIndex + 1] = arr[end];
        arr[end] = tmp;
        quickSort(arr, start, lesserIndex);
        quickSort(arr, lesserIndex + 2, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 獲取資料個數
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt(); // 讀入資料
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
