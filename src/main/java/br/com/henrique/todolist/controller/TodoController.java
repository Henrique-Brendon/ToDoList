package br.com.henrique.todolist.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.henrique.todolist.entity.Todo;
import br.com.henrique.todolist.service.TodoService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service){
        this.service = service;
    }
    
    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return service.create(todo);
    }

    @GetMapping
    List<Todo> list(Todo todo){
        return service.list();
    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return service.update(todo);
    }

    @DeleteMapping("/{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return service.delete(id);
    }

}
