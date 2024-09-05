import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Person> arrayDeque = new ArrayDeque<>(List.of(
                new Person(30, "鄭宜"),
                new Person(20, "陳生")
        ));
        System.out.println(arrayDeque);
        arrayDeque.offerLast(new Person(20, "陳生"));
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(new Person(30, "鄭宜"));
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
        for (var it = arrayDeque.descendingIterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
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
