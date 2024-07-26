public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            System.out.printf("喜歡你的第%d年，%s%n", i, switch (i) {
                        case 1 -> "我還沒有告白";
                        case 6 -> "我終於告白了";
                        default -> "我還是沒告白";
                    }
            );
            i++;
        }
    }
}
