import java.util.Scanner;

public class Main {
    static int prime_count = 0;
    static int composite_count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if (start < 2 || end < start) return;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.printf("%d is prime%n", i);
                continue;
            }
            System.out.printf("%d is not prime%n", i);
        }
        System.out.printf("total: %d prime(s) / %d composite(s)",
                prime_count, composite_count);
    }

    static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                composite_count++;
                return false;
            }
        }
        prime_count++;
        return true;
    }
}
