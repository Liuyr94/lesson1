package com.bessonov.lesson1.animals;

public abstract class Animal {
    String name;
    String color;
    int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя - " + name + ".\nЦвет - " + color + ".\nВозраст кота - " + age + ".");
    }

    public abstract void voice();
}
