import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    // 合併排序法
    public static void mergeSort(int[] arr, int start, int end) {
        if (start == end) return; // 治：若只有一個資料則為排序完成
        // 分：將資料拆分為兩組；治：分別排序兩組資料
        int mid = start - (start - end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        // 合：合併兩組有序資料
        int[] tmp = new int[end - start + 1];
        int lIndex = start, rIndex = mid + 1, i = 0;
        while (lIndex <= mid && rIndex <= end) tmp[i++] = arr[lIndex] < arr[rIndex] ? arr[lIndex++] : arr[rIndex++];
        while (lIndex <= mid) tmp[i++] = arr[lIndex++];
        while (rIndex <= end) tmp[i++] = arr[rIndex++];
        for (i = 0; i < tmp.length; i++) arr[start + i] = tmp[i];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 獲取資料個數
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt(); // 讀入資料
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
