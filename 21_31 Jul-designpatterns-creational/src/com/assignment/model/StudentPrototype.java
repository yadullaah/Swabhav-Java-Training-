package com.assignment.model;
public class StudentPrototype implements Cloneable {
    private int id;
    private String name;
    private String grade;

    public StudentPrototype(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
	public Object clone() {
        StudentPrototype clonedStudent = null;
        try {
            clonedStudent = (StudentPrototype) super.clone();
            // If deep copy is needed, clone mutable fields here.
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonedStudent;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
    }
}


