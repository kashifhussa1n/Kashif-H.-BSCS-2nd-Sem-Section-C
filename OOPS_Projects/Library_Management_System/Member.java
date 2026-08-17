package OOPS_Projects.Library_Management_System;

public class Member {

    private String name;
    private int id;

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;

    }

    public int getId() {
        return this.id;
    }

}