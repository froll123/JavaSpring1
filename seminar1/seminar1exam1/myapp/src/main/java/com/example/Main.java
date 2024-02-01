package com.example;

import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Смит", 30);

        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);

        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println(deserializedPerson);

    }
}
