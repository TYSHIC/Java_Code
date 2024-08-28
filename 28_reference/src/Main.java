import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1};
        int[] b = new int[]{a[0]};
        int[] c = a;
        int[] d = Arrays.copyOf(a, a.length);
        a[0]++;
        System.out.println(a[0]);
        System.out.println(b[0]);
        System.out.println(c[0]);
        System.out.println(d[0]);
    }
}
