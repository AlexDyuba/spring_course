package com.alexDyuba.spring;

public class Person {
    private Pet pet;
    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hey my pet, say something");
        pet.say();
    }
}
