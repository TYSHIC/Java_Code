import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(35, "蔡秦");
        System.out.println(person1);
        Person person2 = new Person(35, "蔡秦");
        System.out.println(person2);
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }
}

class Person {
    protected int age = 0;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名：%s 年齡：%d".formatted(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}