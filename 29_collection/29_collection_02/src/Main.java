import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>(List.of(
                new Person(30, "鄭宜"),
                new Person(20, "陳生")
        ));
        arrayList.addFirst(new Person(20, "陳生"));
        System.out.println(arrayList);
        System.out.println(
                arrayList.indexOf(new Person(20, "陳生"))
        );
        System.out.println(
                arrayList.lastIndexOf(new Person(20, "陳生"))
        );
        arrayList.addLast(new Person(30, "鄭宜"));
        // 與 arrayList.add(new Person(30, "鄭宜")); 等價
        System.out.println(arrayList);
        System.out.println(arrayList.reversed());
    }
}

class Person {
    protected int age;
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
