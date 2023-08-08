package Uchoba;

import Uchoba.Group;

public class Course {
    private String facultyName;
    private int courseNumber;
    private String instructorName;
    private Group[] groups;

    public Course(String facultyName, int courseNumber, String instructorName, Group[] groups) {
        this.facultyName = facultyName;
        this.courseNumber = courseNumber;
        this.instructorName = instructorName;
        this.groups = groups;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}