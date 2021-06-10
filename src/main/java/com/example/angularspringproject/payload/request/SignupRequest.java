package com.example.angularspringproject.payload.request;

import com.example.angularspringproject.entities.StudyCountry;
import com.example.angularspringproject.entities.StudyDomain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Set;


public class SignupRequest {

    private String pseudo;
    private String email;
    private String password;
    private StudyDomain studyDomain;
    private StudyCountry studyCountry;
    private String birthdate;

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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
}
