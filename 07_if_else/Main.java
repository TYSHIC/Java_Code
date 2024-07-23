import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("回憶過去")) {
            System.out.println("痛苦的相思忘不了");
        } else if (input.equals("想念你的笑")) {
            System.out.println("想念你的外套");
        } else if (input.equals("怎麼忍心怪你犯了錯") || input.equals("怎麼忍心讓你受折磨")) {
            System.out.println("是我給你自由過了火");
        } else if (input.equals("我願變成童話裡你愛的那個天使")) {
            System.out.println("張開雙手變成翅膀守護你");
        } else {
            System.out.println("我不知道下一句是什麼");
        }
    }
}
