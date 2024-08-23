public class Main {
    public static void main(String[] args) {
        class Person extends Animal {
            int height;

            Person(String name, int age, int height) {
                super(name, age);
                this.height = height;
            }

            void printInfo() {
                System.out.printf("名稱：%s 年齡：%d 身高：%d %n", name, age, height);
            }
        }
        Animal animal1 = new Animal.Cat("小貓", 2);
        Animal.printInfo(animal1);
        Animal animal2 = new Animal.Dog("小狗", 5);
        Animal.printInfo(animal2);
        Animal animal3 = new Person("小人", 10, 140);
        Animal.printInfo(animal3);
        Animal animal4 = new Animal("小鯨", 7) {
            @Override
            void printInfo() {
                System.out.printf("名稱：%s 年齡：我的年齡是祕密！ %n", name);
            }
        };
        Animal.printInfo(animal4);
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

    static class Cat extends Animal {

        Cat(String name, int age) {
            super(name, age);
        }

        void meow() {
            System.out.println("喵！");
        }
    }

    static class Dog extends Animal {

        Dog(String name, int age) {
            super(name, age);
        }

        void bark() {
            System.out.println("汪！");
        }
    }
}
