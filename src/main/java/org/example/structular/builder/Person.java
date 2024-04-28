package org.example.structular.builder;

public class Person {
    private Double id;
    private String name;
    private int age;
    private String country;
    private int phone;

    public static class Builder{
        private final Person person;
        Builder(){
            person = new Person();
        }

        public Builder id(Double id){
            person.id = id;
            return this;
        }

        public Builder name(String name){
            person.name = name;
            return this;
        }

        public Builder age(int age){
            person.age = age;
            return this;
        }

        public Builder country(String country){
            person.country = country;
            return this;
        }

        public Builder phone(int phone){
            person.phone = phone;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
