package com.embadded;

import operation.Student;

import javax.persistence.Entity;

@Entity
public class Course {

    private Long SubId;
    private String Subname;

    private Student student;

    public Course(Long subId, String subname, Student student) {
        SubId = subId;
        Subname = subname;
        this.student = student;
    }

    public Long getSubId() {
        return SubId;
    }

    public void setSubId(Long subId) {
        SubId = subId;
    }

    public String getSubname() {
        return Subname;
    }

    public void setSubname(String subname) {
        Subname = subname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Course{" +
                "SubId=" + SubId +
                ", Subname='" + Subname + '\'' +
                ", student=" + student +
                '}';
    }
}
