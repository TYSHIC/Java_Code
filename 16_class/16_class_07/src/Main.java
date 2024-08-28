public class Main {
    public static void main(String[] args) {
        Person person =
                new Person(new PersonData("徐懷豫", 30, 160, 40));
        System.out.println(person);
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
                "name=" + data.getName() + ",age=" + data.getAge() +
                ",height=" + data.getHeight() + ",weight=" + data.getWeight() +
                '}';
    }
}

class PersonData {
    private String name;
    private int age;
    private int height;
    private int weight;

    public PersonData() {
    }

    public PersonData(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
