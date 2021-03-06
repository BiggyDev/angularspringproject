package com.example.angularspringproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name= "books")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstudent")
    private int id;
    private String pseudo;
    private String email;
    private String password;
    private StudyDomain studyDomain;
    private StudyCountry studyCountry;
    private LocalDateTime birthdate;

    public Student() {}

    public Student(int id, String pseudo, String email, String password, StudyDomain studyDomain, StudyCountry studyCountry, LocalDateTime birthdate) {
        this.id = id;
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.studyDomain = studyDomain;
        this.studyCountry = studyCountry;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudyDomain getStudyDomain() {
        return studyDomain;
    }

    public void setStudyDomain(StudyDomain studyDomain) {
        this.studyDomain = studyDomain;
    }

    public StudyCountry getStudyCountry() {
        return studyCountry;
    }

    public void setStudyCountry(StudyCountry studyCountry) {
        this.studyCountry = studyCountry;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", studyDomain=" + studyDomain +
                ", studyCountry=" + studyCountry +
                ", birthdate=" + birthdate +
                '}';
    }
}
