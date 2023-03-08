package com.testing.hibernatedemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateDemoApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testStudentRepository(){
        studentRepository.testPersistedData();
    }

}
