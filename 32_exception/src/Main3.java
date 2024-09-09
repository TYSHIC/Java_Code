import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        while (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            try {
                printElement(strings, index);
            } catch (IllegalArgumentException e) {
                System.out.println("錯誤訊息：" +
                        e.getMessage());
                System.out.println("造成錯誤原因：" +
                        e.getCause().getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void printElement(String[] arr, int index) {
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("索引值超出範圍", e);
        }
    }
}