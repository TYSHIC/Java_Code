public class Main {
    public static void main(String[] args) {
        Person person = new Person(10, "蔡秦");
        person.printInfo();
        Worker worker = new Worker(10, "周節倫", "歌手");
        worker.printInfo();
    }
}

class Person {
    private int age = 0;
    String name;

    Person(int age, String name) {
        setAge(age);
        this.name = name;
    }

    void printInfo() {
        System.out.printf("姓名：%s 年齡：%d %n", name, age);
    }

    void setAge(int age) {
        if (age < 0) age = 0;
        this.age = age;
    }

    int getAge() {
        return age;
    }
}

class Worker extends Person {
    String occupation;

    Worker(int age, String name) {
        super(age, name);
    }

    Worker(int age, String name, String occupation) {
        this(age, name);
        this.occupation = occupation;
    }

    @Override
    void printInfo() {
        System.out.printf("姓名：%s 年齡：%d 職業：%s %n",
                name, getAge(), occupation);
    }

    @Override
    void setAge(int age) {
        if (age < 15) age = 15;
        super.setAge(age);
    }
}