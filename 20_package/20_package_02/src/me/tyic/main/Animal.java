package me.tyic.main;

import me.tyic.main.animals.Cat;
import me.tyic.main.animals.Dog;

public abstract class Animal {
    String name;
    int age;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("名稱：%s 年齡：%d %n", name, age);
    }

    public static void printInfo(Animal animal) {
        animal.printInfo();
        makeSound(animal);
    }

    public static void makeSound(Animal animal) {
        if (animal instanceof Cat cat) {
            cat.meow();
        } else if (animal instanceof Dog dog) {
            dog.bark();
        }
    }
}