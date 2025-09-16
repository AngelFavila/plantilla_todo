package com.alumnositm.todo.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alumnositm.todo.entities.TodoEntity;
import com.alumnositm.todo.repository.TodoRepository;
import com.alumnositm.todo.services.TodoServices;

@Service
public class TodoServicesImpl implements TodoServices {

    private final TodoRepository todoRepository;

    public TodoServicesImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<TodoEntity> allTodos() {
       // List<TodoEntity> todos = List.of(
           // new TodoEntity(1L, "Learn Spring Boot", "Complete the Spring Boot tutorial", TodoStatus.PENDING),
           // new TodoEntity(2L, "Build a REST API", "Create a RESTful API using Spring Boot", TodoStatus.IN_PROGRESS),
           // new TodoEntity(3L, "Write Unit Tests", "Write unit tests for the application", TodoStatus.COMPLETED)
      //  );
         List<TodoEntity> todos = todoRepository.findAll();
        return todos;
    }



}
