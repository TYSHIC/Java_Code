public class Main {
    public static void main(String[] args) {
        final int INT_MAX = 2147483647;
        int a = INT_MAX + 1;
        long b = INT_MAX + 1;
        long c = INT_MAX + 1L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}