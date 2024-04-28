package org.example.structular.builder;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person.Builder().
                id(1.0).
                age(12).
                name("Vova").
                country("USA").
                phone(11111111)
                .build();
    }


}
