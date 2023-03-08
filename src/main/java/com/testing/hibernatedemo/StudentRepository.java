package com.testing.hibernatedemo;

import jakarta.persistence.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class StudentRepository {

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    public void testPersistedData() {
        var entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        var student = new Student(null,"first","second", "example@gmail.com",   22);
        log.info(student.toString());

        entityManager.persist(student);
//        student.setFirstName("changed"); // any change made will be reflected in the database
//        log.info(student.toString());

        transaction.commit();
        student.setFirstName("changed again"); // not persisted after end of a transaction
        log.info(student.toString());
    }
}
