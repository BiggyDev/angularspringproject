package com.example.angularspringproject.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name= "posts")
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpost")
    private int id;
    private String content;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="Europe/Paris")
    private LocalDateTime date;
    @ManyToOne
    @JoinColumn(name = "studentfk")
    private Student student;

    @OneToMany
    @JoinColumn(name = "postfk")
    private List<Comment> comments;

    public Post() {}

    public Post(int id, String content, LocalDateTime date, Student student, List<Comment> comments) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.student = student;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", student=" + student +
                ", comments=" + comments +
                '}';
    }
}
