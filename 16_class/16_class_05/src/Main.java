public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(60, "任嫌齊");
        person1.printInfo();
        Person person2 = new Person(-65, "李宗聖");
        person2.printInfo();
        Person person3 = new Person(30, "蔡秦", true);
        person3.printInfo();
    }
}

class Person {
    int age = 0;
    String name;
    boolean pregnant = false;

    Person(int age, String name) {
        setAge(age);
        this.name = name;
    }

    Person(int age, String name, boolean pregnant) {
        this(age, name);
        this.pregnant = pregnant;
    }

    void printInfo() {
        System.out.printf("姓名：%s 年齡：%d ", name, age);
        System.out.println(pregnant ? "懷孕" : "");
    }

    void setAge(int age) {
        if (age < 0) age = 0;
        this.age = age;
    }
}