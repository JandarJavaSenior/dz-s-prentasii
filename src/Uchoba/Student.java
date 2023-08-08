package Uchoba;

import java.time.LocalDate;

public class Student {
        private LocalDate birthDate;
        private String firstName;
        private String lastName;
        private String email;

        public Student(LocalDate birthDate, String firstName, String lastName, String email) {
            this.birthDate = birthDate;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public Student() {
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getAge() {
            return LocalDate.now().getYear() - birthDate.getYear();
        }
    }

