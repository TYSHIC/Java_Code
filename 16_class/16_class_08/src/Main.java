public class Main {
    public static void main(String[] args) {
        System.out.println("載入 SayHello 類別前");
        SayHello.wow(); // 載入 SayHello 類別
        System.out.println("載入 SayHello 類別後");
    }
}

class SayHello {
    static {
        System.out.println("Hello");
    }

    static void wow() {
    }
}
