import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrayHelper.map(arr,
                new ArrayHelper.MapFunction() {
                    @Override
                    public int map(int value) {
                        return value + 6;
                    }
                });
        System.out.println(Arrays.toString(arr));
    }
}

abstract class ArrayHelper {
    public interface MapFunction {
        int map(int value);
    }

    public static void map(int[] array,
                           MapFunction mapFunction) {
        for (int i = 0; i < array.length; i++) {
            array[i] = mapFunction.map(array[i]);
        }
    }
}
