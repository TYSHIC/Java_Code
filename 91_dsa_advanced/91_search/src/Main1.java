import java.util.Scanner;

public class Main1 {
    // 回傳陣列為 [最大值, 最小值]
    public static int[] search(int[] arr, int start, int end) {
        // 治：若只有一個資料，則該資料即為最大、最小值
        if (start == end) return new int[]{arr[start], arr[start]};
        // 分：將資料分成兩組；治：找出拆分資料的最大、最小值
        int mid = start - (start - end) / 2;
        int[] left = search(arr, start, mid);
        int[] right = search(arr, mid + 1, end);
        // 合：比較兩組資料的最大、最小值，得出原資料的最大、最小值
        return new int[]{Math.max(left[0], right[0]), Math.min(left[1], right[1])};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 獲取資料個數
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt(); // 讀入資料
        int[] result = search(arr, 0, arr.length - 1);
        System.out.printf("max = %d, min = %d", result[0], result[1]);
    }
}
