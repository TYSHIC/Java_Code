public class Main {
    public static void main(String[] args) {
        Person person1 =
                new Person(new PersonData("徐懷豫", 30, 160, 40));
        Person person2 = new Person(new PersonData("芳大同"));
        System.out.println(person1);
        person2.data.print();
    }
}

class Person {
    PersonData data;

    Person(PersonData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + data.name() + ",age=" + data.age() +
                ",height=" + data.height() + ",weight=" + data.weight() +
                '}';
    }
}

record PersonData(String name, int age, int height, int weight) {
    PersonData {
        age = Math.max(age, 0);
        height = Math.max(height, 0);
        weight = Math.max(weight, 0);
        // 編譯器會自動補上：
        // this.name = name;
        // this.age = age;
        // this.height = height;
        // this.weight = weight;
    }

    PersonData(String name) {
        this(name, 0, 0, 0);
    }

    void print() {
        System.out.println(this);
    }
}
