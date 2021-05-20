package com.example.angularspringproject.repositories;

import com.example.angularspringproject.entities.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
@Transactional
public class AdvancedStudentRepository {
    @PersistenceContext
    private EntityManager em;

    public Student getByEmail(String email) {
        Student student = null;
        try {
            Query query = em.createQuery("SELECT s FROM Student AS s WHERE s.email = :email");
            query.setParameter("email", email);
            student = (Student)query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }
}
