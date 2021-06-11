package com.example.todoapplication.service;

import com.example.todoapplication.model.ToDoItem;
import com.example.todoapplication.repository.ToDoItemRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ToDoItemService {

    private final ToDoItemRepo toDoItemRepo;

    public List<ToDoItem> fetchAllToDoItems() {
        return toDoItemRepo.findAll();
    }

    public ToDoItem updateToDoItem(ToDoItem toDoItem) {
         toDoItemRepo.save(toDoItem);
         return toDoItemRepo.getById(toDoItem.getId());
    }
}
