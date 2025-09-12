package com.alumnositm.todo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnositm.todo.entities.TodoEntity;
import com.alumnositm.todo.services.TodoServices;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    
    private final TodoServices todoServices;

    public TodoController(TodoServices todoServices) {
        this.todoServices = todoServices;
    }

    @GetMapping()
    public ResponseEntity<List<TodoEntity>> allTodos() {
        return ResponseEntity.ok(todoServices.allTodos());
    }


    
}
