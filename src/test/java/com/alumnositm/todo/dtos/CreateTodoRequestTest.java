package com.alumnositm.todo.dtos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.alumnositm.todo.dtos.request.CreateTodoRequest;

public  class CreateTodoRequestTest {
    
    @Test
    void testContructorAndGetterSetter(){
        String title = "Test Title";
        String description = "Test Description";
        String descriptionError = "Test Description Error";

        CreateTodoRequest createTodoRequest = new CreateTodoRequest(title, description);
        assertEquals(descriptionError, createTodoRequest.getDescription());
        assertEquals(title, createTodoRequest.getTitle());
    }

    @Test
    void testCosntructorModify(){
        String title = "Test Title";
        String description = "Test Description";
        String newTitle = "New Test Title";
        String newDescription = "New Test Description";

        CreateTodoRequest createTodoRequest = new CreateTodoRequest(title, description);
        createTodoRequest.setTitle(newTitle);
        createTodoRequest.setDescription(newDescription);

        assertEquals(newTitle, createTodoRequest.getTitle());
        assertEquals(newDescription, createTodoRequest.getDescription());

        assertNotEquals(title, createTodoRequest.getTitle());
        assertNotEquals(description, createTodoRequest.getDescription());
    }

}
