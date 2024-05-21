package org.example;

import org.example.validator.courseCode;

import javax.validation.constraints.*;

public class Customer {
    @Size(min=3,message= " name must be more than 3 letters")
    private String firstName;
    @Size(min=3,message= " name must be more than 3 letters")
    private String lastName;
    @NotNull
    @Email(message= " must be in email pattern")
    private String email;
    private boolean active;
    private String gender;
    @Min(20)
    private int age;
    private  String country;
    @courseCode(value = "lu", message = "must start with lu")
    private String courseCode;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, boolean active, String gender, int age, String country, String courseCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = active;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
