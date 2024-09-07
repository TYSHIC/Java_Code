import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Person> hashMap = new HashMap<>();
        hashMap.put(0, new Person(30, "張雨"));
        hashMap.put(1, new Person(35, "吳棕憲"));
        hashMap.put(2, new Person(40, "劉德滑"));
        System.out.println(hashMap);
        for (Iterator<Map.Entry<Integer, Person>> it =
             hashMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<Integer, Person> personEntry = it.next();
            personEntry.getValue().age += 10;
        }
        hashMap.forEach((id, person) ->
                System.out.println("編號：" + id + " " + person));
    }
}

class Person {
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
}
