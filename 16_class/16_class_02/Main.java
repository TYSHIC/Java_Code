public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 60;
        person1.name = "任嫌齊";
        System.out.println("person1 創建完成");
        person1.printInfo();
        Person person2 = new Person();
        person2.age = 65;
        person2.name = "李宗聖";
        System.out.println("person2 創建完成");
        person1.printInfo();
        person2.printInfo();
    }
}

class Person {
    int age = 0;
    String name;

    void printInfo() {
        System.out.printf("姓名：%s 年齡：%d %n",
                name, age);
    }
}