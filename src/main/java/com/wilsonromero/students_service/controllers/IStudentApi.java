package com.wilsonromero.students_service.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/students")
public interface IStudentApi {
    @PostMapping
    ResponseEntity<String> create (String name);
    /*
     list
    getById
    update
    delete
     */
}
