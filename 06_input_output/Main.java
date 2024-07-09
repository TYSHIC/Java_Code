import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 創建新的 Scanner 實例
        System.out.print("姓名 學號 身高：");
        String name = scanner.next(); // 讀入下一個字串並存入變數 name
        int studentId = scanner.nextInt(); // 讀入下一個 int 並存入變數 studentId
        double height = scanner.nextDouble(); // 讀入下一個 double 並存入變數 height
        System.out.printf("姓名：%s 學號：%d 身高：%.2f%n", name, studentId, height);
    }
}
