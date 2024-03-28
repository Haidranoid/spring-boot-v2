package com.in28minutes.todoappbe.controller;

import com.in28minutes.todoappbe.entities.Todo;
import com.in28minutes.todoappbe.repositories.TodoRepository;
import com.in28minutes.todoappbe.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoJpaController {
    private TodoService todoService;
    private TodoRepository todoRepository;

    @Autowired
    public TodoJpaController(
            TodoService todoService,
            TodoRepository todoRepository
    ) {
        this.todoService = todoService;
        this.todoRepository = todoRepository;
    }


    @GetMapping("/users/{username}/todos")
    public ResponseEntity<List<Todo>> retrieveTodos(@PathVariable String username) {

       // return ResponseEntity.ok(todoService.findByUsername(username));
        List<Todo> todos = todoRepository.findByUsername(username);
        return ResponseEntity.ok(todos);
    }

    @GetMapping("/users/{username}/todos/{id}")
    public Todo retrieveTodo(@PathVariable String username, @PathVariable int id) {

        return todoService.findById(id);
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable int id) {

        todoService.deleteById(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("/users/{username}/todos/{id}")
    public Todo updateTodo(@PathVariable String username, @PathVariable int id, @RequestBody Todo todo) {

        todoService.updateTodo(todo);

        return todo;
    }

    @PostMapping("/users/{username}/todos")
    public Todo createTodo(@PathVariable String username, @RequestBody Todo todo) {

        Todo createdTodo = todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), todo.isDone());

        return createdTodo;
    }
}
