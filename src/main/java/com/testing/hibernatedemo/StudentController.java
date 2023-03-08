package com.testing.hibernatedemo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;

    @GetMapping("/test/persist")
    public ResponseEntity<?> testPersist(){
        studentRepository.testPersistedData();
        return ResponseEntity.ok("hi");
    }
}
