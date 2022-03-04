package com.soringcore;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Employee {

    private String employeeName;
    private List<String>phone;
    private Set<String> address;
    private Map<String , String> course;
    public Employee() {
    }

    public Employee(String name, List<String> phone, Set<String> address, Map<String, String> course) {
        this.employeeName = name;
        this.phone = phone;
        this.address = address;
        this.course = course;
    }



    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeName, employee.employeeName) && Objects.equals(phone, employee.phone) && Objects.equals(address, employee.address) && Objects.equals(course, employee.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, phone, address, course);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + employeeName + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                ", course=" + course +
                '}';
    }
}
