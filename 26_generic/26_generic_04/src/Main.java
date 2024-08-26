import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7};
        ArrayHelper.map(intArr, (value) -> value / 2);
        System.out.println(Arrays.toString(intArr));
    }
}

abstract class ArrayHelper {
    @FunctionalInterface
    public interface Mapper<E, R extends E> {
        R map(E value);
    }

    public static <E, R extends E> void map(
            E[] srcArray,
            Mapper<E, R> mapFunction) {
        for (int i = 0; i < srcArray.length; i++) {
            srcArray[i] = mapFunction.map(srcArray[i]);
        }
    }
}