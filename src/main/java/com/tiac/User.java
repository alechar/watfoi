package com.tiac;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int sumAndSubtract(int a, int b, boolean sign) {
        if (sign) {
            return a + b;
        } else {
            return a - b;
        }
    }
}
