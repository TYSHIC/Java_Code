public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++)
            System.out.printf("喜歡你的第%d年，%s%n", i, switch (i) {
                        case 1 -> "我還沒有告白";
                        case 6 -> "我終於告白了";
                        default -> "我還是沒告白";
                    }
            );
    }
}
