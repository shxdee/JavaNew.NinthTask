package com.shxdee.ninthtask;

import java.util.Objects;

public class Student extends Human {
    private String university;
    private String faculty;
    private String spec;

    public Student(String lastName, String firstName, String patronymic, int age, Gender gender, String university, String faculty, String spec) {
        super(lastName, firstName, patronymic, age, gender);
        this.university = university;
        this.faculty = faculty;
        this.spec = spec;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(university, student.university) && Objects.equals(faculty, student.faculty) && Objects.equals(spec, student.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), university, faculty, spec);
    }
}
