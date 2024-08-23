import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 2, 5, 8, 3, 6, 9};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.equals(arr1, arr2));
        Arrays.sort(arr1);
        System.out.println(Arrays.binarySearch(arr1, 2));
        System.out.println(Arrays.toString(arr1));
        int[] arr3 = new int[4];
        Arrays.fill(arr3, 6);
        System.out.println(Arrays.toString(arr3));
    }
}
