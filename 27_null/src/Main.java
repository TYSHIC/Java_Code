public class Main {
    public static void main(String[] args) {
        Person person1 =
                new Person(new PersonData("芳大同", 30));
        System.out.println(person1);
        Person person2 = new Person(null);
        System.out.println(person2);
    }
}

class Person {
    PersonData data;

    Person(PersonData data) {
        if (data == null) {
            data = new PersonData("", 0);
        }
        this.data = data;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + data.name() +
                ",age=" + data.age() +
                '}';
    }
}

record PersonData(String name, int age) {
}
