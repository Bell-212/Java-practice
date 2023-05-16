package com.mysite.sbb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello world!";
    }

    @GetMapping("/todo")
    public TodoModel getTodoModel() {
        return new TodoModel(1,2, "delectus aut autem", false);
    }

    @GetMapping("/todos")
    public TodoModel[] getTodoModels() {
        return new TodoModel[] {
                new TodoModel(1, 1, "", false),
                new TodoModel(1, 1, "", false),
                new TodoModel(1, 1, "", false),
                new TodoModel(1, 1, "", false),
        };
    }
}
