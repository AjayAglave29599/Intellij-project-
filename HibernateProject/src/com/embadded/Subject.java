package com.embadded;


import javax.persistence.Embeddable;

@Embeddable
public class Subject {

    private Long subId;
    private String subjectName;

    public Subject(Long subId, String subjectName) {
        this.subId = subId;
        this.subjectName = subjectName;
    }

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subId=" + subId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
