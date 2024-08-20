public class Main2 {
    public static void main(String[] args) {
        int[] arr = {6, 4, 5, 7, 2, 9};
        arr[5]++;
        arr[4] = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
