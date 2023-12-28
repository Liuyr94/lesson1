package com.bessonov.lesson1.animals;

public class Cat extends Animal {
    int clawsLength;

    public Cat(String name, String color, int age, int clawsLength) {
        super(name, color, age);
        this.clawsLength = clawsLength;
    }

    @Override
    public void voice() {
        System.out.println(name + " meow meow meow::))))");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) object;
        return this.name.equals(cat.name) && this.color.equals(cat.color) && this.age == cat.age &&
                this.clawsLength == cat.age;
    }

    @Override
    public int hashCode() {
        return clawsLength * 12;
    }
}
