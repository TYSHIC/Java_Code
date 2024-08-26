import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] arr1 = new double[5];
        double[] arr2 = new double[5];
        double[] arr3 = new double[5];
        double[] arr4 = new double[5];

        Random random1 = new Random();
        Random random2 = new Random(0);
        Random random3 = new Random(0);

        for (int i = 0; i < 5; i++) {
            arr1[i] = random1.nextDouble();
            arr2[i] = random2.nextDouble();
            arr3[i] = random3.nextDouble();
            arr4[i] = Math.random();
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
