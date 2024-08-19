package me.tyic.main.animals;

import me.tyic.main.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("汪！");
    }
}
