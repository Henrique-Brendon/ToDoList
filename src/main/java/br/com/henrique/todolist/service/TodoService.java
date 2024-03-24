package br.com.henrique.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.henrique.todolist.entity.Todo;
import br.com.henrique.todolist.repository.TodoRepository;

@Service
public class TodoService {
    
    private TodoRepository repository;

    public TodoService(TodoRepository repository){
        this.repository = repository;
    }
    
    public List<Todo> create(Todo todo){
        repository.save(todo);
        return list();
    }

    public List<Todo> list(){
        Sort sort = Sort.by("property").descending().and(
            Sort.by("name").ascending()
        );
        return repository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        repository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id){
        repository.deleteById(id);
        return list();
    }

}
