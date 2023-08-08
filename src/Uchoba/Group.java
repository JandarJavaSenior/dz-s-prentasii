package Uchoba;

import Uchoba.Student;

import java.time.LocalDate;

public class Group {
    private Student[] students;
    private String studyInfo;
    private LocalDate startDate;

    public Group(Student[] students, String studyInfo, LocalDate startDate) {
        this.students = students;
        this.studyInfo = studyInfo;
        this.startDate = startDate;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getStudyInfo() {
        return studyInfo;
    }

    public void setStudyInfo(String studyInfo) {
        this.studyInfo = studyInfo;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
