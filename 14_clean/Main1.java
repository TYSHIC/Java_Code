import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if (start >= 2 && end >= 2 && end >= start) {
            for (int i = start; i <= end; i++) {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime == true) {
                    System.out.printf("%d is prime%n", i);
                } else {
                    System.out.printf("%d is not prime%n", i);
                }
            }
        }
    }
}
