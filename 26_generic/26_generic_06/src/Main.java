import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Group<Integer> integerGroup1 =
                new Group<>(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        Group<Object> integerGroup2 = new Group<>(new Object[7]);
        integerGroup1.map(integerGroup2, (value) -> value * 8);
        System.out.println(integerGroup2);
    }
}

class Group<E> {
    @FunctionalInterface
    public interface Mapper<E, R extends E> {
        R map(E value);
    }

    private final E[] data;

    public final int length;

    public Group(E[] data) {
        this.data = data;
        this.length = data.length;
    }

    public void setElement(E element, int index) {
        data[index] = element;
    }

    public E getElement(int index) {
        return data[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public void map(
            Group<? super E> dstGroup,
            Mapper<E, ? extends E> mapFunction
    ) {
        for (int i = 0; i < data.length; i++) {
            dstGroup.setElement(mapFunction.map(getElement(i)), i);
        }
    }
}