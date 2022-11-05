package com.company.java_advanced.homework2.task1;

public class Customers {
    private int id;
    private String first_name;
    private String second_name;
    private String email;

    public Customers() {}

    public Customers(int id, String first_name, String second_name, String email) {
        this.id = id;
        this.first_name = first_name;
        this.second_name = second_name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
