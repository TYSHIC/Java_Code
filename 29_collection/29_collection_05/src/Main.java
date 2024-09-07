import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Collections.addAll(people,
                new Person(50, "善依純"),
                new Person(10, "蕭亞瑄"),
                new Person(40, "郭靖"),
                new Person(30, "陳生"),
                new Person(20, "徐懷豫"));
        System.out.println(Collections.min(people) +
                ", " + Collections.max(people));
        Comparator<Person> reversedComp =
                Collections.reverseOrder(Person::compareTo);
        Collections.sort(people, reversedComp);
        System.out.println(people);
        System.out.println(Collections.binarySearch(people,
                new Person(20, "徐懷豫"), reversedComp));
        Collections.shuffle(people);
        System.out.println(people);
    }
}

class Person implements Comparable<Person> {
    int age;
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

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}
