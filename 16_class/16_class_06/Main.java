public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(35, "蔡秦", true);
        person1.printInfo();
        person1.setAge(-35);
        System.out.println(person1.getAge());
    }
}

class Person {
    private int age = 0;
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

    int getAge() {
        return age;
    }
}