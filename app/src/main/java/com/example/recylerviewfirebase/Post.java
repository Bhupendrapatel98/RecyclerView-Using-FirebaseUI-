package com.example.recylerviewfirebase;

public class Post {

    String email;
    String name;
    String number;
    String password;

    public Post() {

    }

    @Override
    public String toString() {
        return "Post{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
