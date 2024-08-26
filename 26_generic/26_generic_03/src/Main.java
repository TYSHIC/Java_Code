import java.util.Arrays;

// 25_interface_06 改寫
public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7};
        Num[] numArr = new Num[7];
        ArrayHelper.map(intArr, Num::new, numArr);
        System.out.println(Arrays.toString(numArr));
        ArrayHelper.map(numArr, Num::square, numArr);
        System.out.println(Arrays.toString(numArr));
        ArrayHelper.map(numArr, Num::negative, numArr);
        System.out.println(Arrays.toString(numArr));
    }
}

class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public Num square() {
        return new Num(number * number);
    }

    public static Num negative(Num num) {
        return new Num(-num.number);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}


abstract class ArrayHelper {
    @FunctionalInterface
    public interface Mapper<E, R> {
        R map(E value);
    }

    public static <E, R> void map(E[] srcArray, Mapper<E, R> mapFunction, R[] dstArray) {
        for (int i = 0; i < Math.max(srcArray.length, dstArray.length); i++) {
            dstArray[i] = mapFunction.map(srcArray[i]);
        }
    }
}
