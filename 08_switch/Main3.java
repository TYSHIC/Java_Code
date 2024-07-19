import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = switch (input) {
            case "回憶過去" -> "痛苦的相思忘不了";
            case "想念你的笑" -> "想念你的外套";
            case "怎麼忍心怪你犯了錯", "怎麼忍心讓你受折磨" -> "是我給你自由過了火";
            case "我願變成童話裡你愛的那個天使" -> "張開雙手變成翅膀守護你";
            default -> {
                if (input.isEmpty()) yield "沒有輸入任何東西";
                yield "我不知道下一句是什麼";
            }
        };
        System.out.println(output);
    }
}
