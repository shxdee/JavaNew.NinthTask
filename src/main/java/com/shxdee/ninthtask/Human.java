package com.shxdee.ninthtask;

import java.util.Objects;

public class Human implements Comparable<Human> {
    private String lastName;
    private String firstName;
    private String patronymic;
    private int age;
    private Gender gender;

    public Human(String lastName, String firstName, String patronymic, int age, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.age = age;
        this.gender = gender;
    }

    public Human(Human human) {
        lastName = new String(human.lastName);
        firstName = new String(human.firstName);
        patronymic = new String(human.patronymic);
        age = human.age;
        gender = human.gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {this.firstName = firstName; }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic() {this.patronymic = patronymic; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {this.lastName = lastName; }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(lastName, human.lastName) && Objects.equals(firstName, human.firstName) && Objects.equals(patronymic, human.patronymic) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, patronymic, lastName, age, gender);
    }

    @Override
    public int compareTo(Human o) {
        return Integer.compare(getAge(), o.getAge());
    }
}
