package Uchoba;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
                Student student1 = new Student(LocalDate.of(2000, 5, 15), "Иван", "Иванов", "ivan@example.com");
                Student student2 = new Student(LocalDate.of(2001, 7, 20), "Мария", "Петрова", "maria@example.com");
                Student student3 = new Student(LocalDate.of(1999, 2, 10), "Алексей", "Сидоров", "alex@example.com");

                Student[] students = {student1, student2, student3};
                Group group = new Group(students, "Программирование", LocalDate.of(2023, 9, 1));

                Group[] groups = {group};
                Course course = new Course("Информационные технологии", 3, "Петр Сергеевич", groups);

                System.out.println("Имя студента: " + student1.getFirstName());
                System.out.println("Факультет: " + course.getFacultyName());
                System.out.println("Курс: " + course.getCourseNumber());
                System.out.println("Возраст: "+student1.getAge());

    }
}