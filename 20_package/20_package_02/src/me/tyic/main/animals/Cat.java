package me.tyic.main.animals;

import me.tyic.main.Animal;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("喵！");
    }
}
