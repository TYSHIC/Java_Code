public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(60);
        person1.name = "任嫌齊";
        person1.printInfo();
        Person person2 = new Person();
        person2.setAge(-65);
        person2.name = "李宗聖";
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

    void setAge(int age) {
        if (age < 0) age = 0;
        this.age = age;
    }
}