package com.example;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
//        return "Person{" +
//                "firstname='" + firstname + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", age=" + age +
//                '}';
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return new EqualsBuilder()
                .append(age, person.age)
                .append(firstname, person.firstname)
                .append(lastname, person.lastname)
                .isEquals();
//        return age == person.age && Object.equals(firstname, person.firstname) &&
//                Object.equals(lastname, person.lastname);
    }

    public int hashCoda(){
        return HashCodeBuilder.reflectionHashCode(this);
//        return Object.hash(firstname, lastname, age);
    }
}
