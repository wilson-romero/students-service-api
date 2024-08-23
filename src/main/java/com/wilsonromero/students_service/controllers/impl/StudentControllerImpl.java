package com.wilsonromero.students_service.controllers.impl;

import com.wilsonromero.students_service.controllers.IStudentApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerImpl implements IStudentApi {

    @Override
    public ResponseEntity<String> create(String name) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Student created: " + name);
    }
}
