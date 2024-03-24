package br.com.henrique.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.henrique.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
