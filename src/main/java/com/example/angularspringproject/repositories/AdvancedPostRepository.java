package com.example.angularspringproject.repositories;

import com.example.angularspringproject.entities.Post;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AdvancedPostRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Post> getByAuthor(int id) {
        List<Post> res = null;
        try {
            Query query = em.createQuery("SELECT p FROM Post AS p WHERE p.student.id = :id");
            query.setParameter("id", id);
            res = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;

    }
}
