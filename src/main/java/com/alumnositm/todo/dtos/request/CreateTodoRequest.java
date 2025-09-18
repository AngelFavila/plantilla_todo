package com.alumnositm.todo.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTodoRequest {
    private String title;
    private String description;

    public CreateTodoRequest( String title, String description) {
        this.title = title;
        this.description = description;
    }
}
