package com.example.model;

public class Student {
    private int rno;

    private String name;

    private String techonology;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechonology() {
        return techonology;
    }

    public void setTechonology(String techonology) {
        this.techonology = techonology;
    }

    public Student(int rno, String name, String techonology) {
        this.rno = rno;
        this.name = name;
        this.techonology = techonology;
    }

    public Student() {
    }


    
}
