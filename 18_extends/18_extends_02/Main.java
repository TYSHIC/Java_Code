public class Main {
    public static void main(String[] args) {
        Person person = new Person(35, "蔡秦");
        person.printInfo();
        Worker worker = new Worker(25, "周節倫", "歌手");
        worker.printInfo();
        Student student = new Student(16, "白氨", 10);
        student.printInfo();

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

    public int getAge() {
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
        System.out.printf("姓名：%s 年齡：%d 職業：%s %n", name, getAge(), occupation);
    }
}

class Student extends Person {
    int grade;

    Student(int age, String name) {
        super(age, name);
    }

    Student(int age, String name, int grade) {
        this(age, name);
        this.grade = grade;
    }

    @Override
    void printInfo() {
        System.out.printf("姓名：%s 年齡：%d 年級：%d %n", name, getAge(), grade);
    }
}