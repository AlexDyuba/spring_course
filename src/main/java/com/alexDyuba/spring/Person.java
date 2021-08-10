package com.alexDyuba.spring;

public class Person {
    private int age;
    private String surname;
    private Pet pet;
    public Person() {
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void callYourPet() {
        System.out.println("Hey my pet, say something");
        pet.say();
    }
}
