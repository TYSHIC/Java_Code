public class Main {
    public static void main(String[] args) {
        final int INT_MAX = 2147483647;
        int a = INT_MAX + 1;
        long b = INT_MAX + 1;
        long c = INT_MAX + 1L;
        double d = INT_MAX + 1.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
