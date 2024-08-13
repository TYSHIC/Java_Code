public class Main {
    public static void main(String[] args) {
        Animal.printInfo(new Person(10, "蔡秦"));
        Animal.printInfo(new Whale(10, 5));
    }
}

abstract class Animal {
    abstract void printInfo();

    static void printInfo(Animal animal) {
        animal.printInfo();
    }
}

class Person extends Animal {
    private int age = 0;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    void printInfo() {
        System.out.printf(
                "姓名：%s 年齡：%d %n",
                name, age);
    }
}

class Whale extends Animal {
    private int length = 0;
    private int width = 0;

    Whale(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void printInfo() {
        System.out.printf(
                "長度：%d 寬度：%d %n",
                length, width);
    }
}