import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person(50, "善依純"),
                new Person(10, "蕭亞瑄"),
                new Person(40, "郭靖"),
                new Person(30, "陳生"),
                new Person(20, "徐懷豫")
        };
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, (person1, person2) ->
                person2.age - person1.age);
        System.out.println(Arrays.toString(people));
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
    public int compareTo(Person o) {
        return age - o.age;
    }
}
