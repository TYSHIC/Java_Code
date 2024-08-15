public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat("小貓", 2);
        Animal.printInfo(animal1);
        Animal animal2 = new Dog("小狗", 5);
        Animal.printInfo(animal2);
    }
}

abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.printf("名稱：%s 年齡：%d %n", name, age);
    }

    static void printInfo(Animal animal) {
        animal.printInfo();
        makeSound(animal);
    }

    static void makeSound(Animal animal) {
        if (animal instanceof Cat) {
            ((Cat) animal).meow();
        } else if (animal instanceof Dog dog) {
            dog.bark();
        }
    }
}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    void meow() {
        System.out.println("喵！");
    }
}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    void bark() {
        System.out.println("汪！");
    }
}