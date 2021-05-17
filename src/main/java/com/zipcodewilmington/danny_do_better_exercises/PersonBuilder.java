package com.zipcodewilmington.danny_do_better_exercises;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, age);
    }
}