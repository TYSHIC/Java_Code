public class Main {
    public static void main(String[] args) {
        Pair<String, String> pair1 =
                new Pair<String, String>("羅志翔", "小朱");
        pair1.set("羅至祥", "小諸");
        System.out.println(pair1);
        var pair2 =
                new Pair<String, String>("梁靜如", "晴歌天后");
        System.out.println(pair2.getLeft());
        var pair3 = new Pair<>("王新凌", "甜欣教主");
        System.out.println(pair3.getRight());
    }
}

class Pair<L, R> {
    private L left;
    private R right;

    public Pair(L left, R right) {
        set(left, right);
    }

    public void set(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return left.toString() + '：' + right.toString();
    }
}
