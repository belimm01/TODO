package com.company.todo.controller;

import com.company.todo.model.TodoEntry;
import com.company.todo.repository.TodoEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoEntryController {

    @Autowired
    TodoEntryRepository todoRepository;

    @GetMapping("/")
    public List<TodoEntry> getAllTodo() {
        return todoRepository.findAll();
    }
}
