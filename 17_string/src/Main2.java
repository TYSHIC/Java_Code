public class Main2 {
    public static void main(String[] args) {
        int i = 1;
        final String PREFIX = "喜歡你的第";
        final String SUFFIX = new String("年，我還是沒告白");
        System.out.println(new StringBuilder().append(PREFIX).append(i++).append("年，我還沒有告白"));
        System.out.println(new StringBuilder().append(PREFIX).append(i++).append(SUFFIX));
        System.out.println(new StringBuilder().append(PREFIX).append(i++).append(SUFFIX));
        System.out.println(new StringBuilder().append(PREFIX).append(i++).append(SUFFIX));
        System.out.println(new StringBuilder().append(PREFIX).append(i++).append(SUFFIX));
        System.out.println(new StringBuilder().append(PREFIX).append(i++).append("年，我終於告白了"));
    }
}
