package com.swiftfingers.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String firstName; // required
    private String lastName; // required

    private int age; // optional
    private String phone; // optional
    private String address; // optional

    //provide a private constructor and pass the builder object as a parameter
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    //All getters and NO setters to provide immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        //pass the required attributes as parameters to the constructor
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        //method to set the optional parameters
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        //method to set the optional parameters
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        //method to set the optional parameters
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        //Return the finally constructed User object
        public User build() {
            User user =  new User(this);
            return user;
        }
    }
}
