import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person(30, "鄭宜"));
        System.out.println(hashSet);
        hashSet.addAll(Set.of(
                new Person(20, "陳生"),
                new Person(30, "鄭宜"),
                new Person(40, "迪鶯"),
                new Person(50, "張棟良")
        ));
        System.out.println(hashSet);
        int ageSum = 0;
        for (Person person : hashSet) {
            ageSum += person.age;
        }
        int ageAvg = ageSum / hashSet.size();
        hashSet.removeIf(person -> person.age >= ageAvg);
        System.out.println(hashSet);
        Iterator<Person> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(hashSet);
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
