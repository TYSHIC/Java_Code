public class Main {
    public static void main(String[] args) {
        char a = 97;
        int b = 65536 + 97;
        char c = (char) b;
        int d = (byte) 258;
        double e = b / d;
        double f = (double) b / d;
        double g = b / (double) d;
        double h = (double) (b / d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
