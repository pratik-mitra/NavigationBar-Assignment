package com.gl.navigationapplication.model;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String surname;
    private String city;
    private String Education;

    public Person() {}

    public Person(String name, String surname, String city, String education) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        Education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", Education='").append(Education).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
