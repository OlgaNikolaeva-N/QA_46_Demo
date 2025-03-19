package dto;

import java.util.Objects;

public class Student {
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String dateOfBirth;
    private String subject;
    private String hobbies;
    private String picture;
    private String addres;
    private String state;
    private String city;

    public Student(String name, String lastName, String email, String gender, String mobile,
                   String dateOfBirth, String subject, String hobbies, String picture, String addres,
                   String state, String city) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.mobile = mobile;
        this.dateOfBirth = dateOfBirth;
        this.subject = subject;
        this.hobbies = hobbies;
        this.picture = picture;
        this.addres = addres;
        this.state = state;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", mobile='" + mobile + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", subject='" + subject + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", picture='" + picture + '\'' +
                ", addres='" + addres + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName)
                && Objects.equals(email, student.email) && Objects.equals(gender, student.gender)
                && Objects.equals(mobile, student.mobile) && Objects.equals(dateOfBirth, student.dateOfBirth)
                && Objects.equals(subject, student.subject) && Objects.equals(hobbies, student.hobbies)
                && Objects.equals(picture, student.picture) && Objects.equals(addres, student.addres)
                && Objects.equals(state, student.state) && Objects.equals(city, student.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, email, gender, mobile, dateOfBirth, subject, hobbies,
                picture, addres, state, city);
    }

    public Student() {

    }


}

