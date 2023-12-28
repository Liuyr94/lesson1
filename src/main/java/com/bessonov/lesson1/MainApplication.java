package com.bessonov.lesson1;

import com.bessonov.lesson1.animals.Animal;
import com.bessonov.lesson1.animals.Cat;
import com.bessonov.lesson1.animals.Dog;

public class MainApplication {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", "white", 4, 12);
        Animal cat1 = new Cat("Murzik", "black", 4, 22);
        Animal dog = new Dog("Leonard", "brown", 12);

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = cat1;
        animals[2] = dog;

        for (Animal animal : animals) {
            animal.voice();
            System.out.println();
        }
    }
}
