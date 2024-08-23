import java.util.Scanner;

// 找整數中連續 n 個數字和的最大值
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String maxString = "";
        int max = -1;
        String string = scanner.next();
        for (int i = 0; i <= string.length() - count; i++) {
            int sum = 0;
            for (int j = 0; j < count; j++) {
                sum += Character.getNumericValue(string.charAt(i + j));
            }
            if (sum > max) {
                max = sum;
                maxString = string.substring(i, i + count);
            }
        }
        System.out.println(maxString + "," + max);
    }
}