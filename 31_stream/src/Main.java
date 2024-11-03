import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) arrayList.add(scanner.next());
        System.out.println(arrayList.stream().reduce(String::concat).orElse(""));
        System.out.println(arrayList.stream()
                .map((str) -> Character.toUpperCase(str.charAt(0)))
                .<StringBuilder>collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
        );
    }
}
