package com.example.angularspringproject.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name= "students")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstudent")
    private int id;
    private String pseudo;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private StudyDomain studyDomain;
    @Enumerated(EnumType.STRING)
    private StudyCountry studyCountry;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="Europe/Paris")
    private Date birthdate;
    @ManyToMany
    @JoinTable(name = "student_to_friends")
    private List<Student> friends;

    public Student() {}

    public Student( String pseudo, String email, String password, StudyDomain studyDomain, StudyCountry studyCountry, Date birthdate, List<Student> friends) {
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.studyDomain = studyDomain;
        this.studyCountry = studyCountry;
        this.birthdate = birthdate;
        this.friends = friends;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<Student> getFriends() {
        return friends;
    }

    public void setFriends(List<Student> friends) {
        this.friends = friends;
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
                ", friends=" + friends +
                '}';
    }
}
