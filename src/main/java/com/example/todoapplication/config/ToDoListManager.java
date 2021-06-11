package com.example.todoapplication.config;

import com.example.todoapplication.model.ToDoItem;
import com.example.todoapplication.repository.ToDoItemRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@AllArgsConstructor
public class ToDoListManager {

    private final ToDoItemRepo toDoItemRepo;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            toDoItemRepo.saveAll(Arrays.asList(
                    new ToDoItem("Do homework", false),
                    new ToDoItem("Clean house", false),
                    new ToDoItem("Check memes", true),
                    new ToDoItem("Try to sleep less than 10 h", false)
            ));

        };
    }
}
