import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        while (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            try {
                System.out.println(strings[index]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("索引值超出範圍！");
            }
        }
    }
}
