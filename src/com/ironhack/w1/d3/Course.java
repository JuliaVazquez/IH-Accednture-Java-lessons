package com.ironhack.w1.d3;

public class Course {
    private int classId;
    private int capacity;
    private int studentCount;
    private String title;

//  CONSTRUCTOR

    public Course(int classId, int capacity, int studentCount, String title) {
        this.classId = classId;
        this.capacity = capacity;
        this.studentCount = studentCount;
        this.title = title;
    }

//  GETTERS

    public int getClassId() {
        return classId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getTitle() {
        return title;
    }

//  SETTERS

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
