import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int[] arr = new int[200];
        while (index < 200 && scanner.hasNextInt()) {
            arr[index++] = scanner.nextInt();
        }
        System.out.println(gcd(arr));
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int gcd(int... nums) {
        if (nums.length == 1) return nums[0];
        return gcd(nums[0],
                gcd(Arrays.copyOfRange(nums,
                        1, nums.length)));
    }
}
