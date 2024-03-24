package br.com.henrique.todolist.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.henrique.todolist.entity.Todo;
import br.com.henrique.todolist.repository.TodoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void run(String... args) throws Exception {

        Todo test = new Todo(null, "test", "test", false, 1);
        todoRepository.save(test);
    }
    
}
