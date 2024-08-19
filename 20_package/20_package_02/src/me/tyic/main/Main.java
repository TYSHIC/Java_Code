package me.tyic.main;

import me.tyic.main.animals.Cat;
import me.tyic.main.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat("小貓", 2);
        Animal.printInfo(animal1);
        Animal animal2 = new Dog("小狗", 5);
        animal2.printInfo();
        Animal.makeSound(animal1);
        Animal.makeSound(animal2);
    }
}
