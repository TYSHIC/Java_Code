import java.util.Optional;

public class Main {
    public static String[] stringArr;

    public static void main(String[] args) {
        Util.printElement(stringArr, 0, "空");
        stringArr = new String[5];
        stringArr[0] = "烏黑的髮尾";
        stringArr[1] = "盤成一個圈";
        Util.printElement(stringArr, 0, "空");
        Util.printElement(stringArr, 2, "空");
    }
}

abstract class Util {
    public static Optional<String> getElement(String[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) return Optional.empty();
        return Optional.of(arr[index] != null ? arr[index] : "(null)");
    }

    public static void printElement(String[] arr, int index, String defaultPrint) {
        Optional<String> string = getElement(arr, index);
        System.out.println(string.orElse(defaultPrint));
    }
}
