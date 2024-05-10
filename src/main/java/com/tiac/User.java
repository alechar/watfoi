package com.tiac;

import java.time.LocalDateTime;
import java.util.List;

public class User {

    private String id;
    private String firstName;
    private String firstLetter;
    private String lastName;
    private String password;
    private LocalDateTime creationDatetime;
    private boolean isActive;

    private String email;

    private List<Integer> integerList;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public User() {
    }

    public User(String id, String firstName, String firstLetter, String lastName, String password, LocalDateTime creationDatetime, String email) {
        this.id = id;
        this.firstName = firstName;
        this.firstLetter = firstLetter;
        this.lastName = lastName;
        this.password = password;
        this.creationDatetime = creationDatetime;
        this.email = email;
    }

    public LocalDateTime getCreationDatetime() {
        return creationDatetime;
    }

    public void setCreationDatetime(LocalDateTime creationDatetime) {
        this.creationDatetime = creationDatetime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public static int substract(int a, int b) {
        return a - b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
