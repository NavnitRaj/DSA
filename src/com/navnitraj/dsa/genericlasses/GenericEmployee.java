package com.navnitraj.dsa.genericlasses;

public class GenericEmployee {
    private int id;
    private String name;

    public GenericEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GenericEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
