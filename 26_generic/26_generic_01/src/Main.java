public class Main {
    public static void main(String[] args) {
        Integer[] integerArr =
                new Integer[]{1, 2, 3, 4, 5};
        System.out.println(lastElement(integerArr));
    }

    public static <T> T lastElement(T[] arr) {
        return arr[arr.length - 1];
    }
}
