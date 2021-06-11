package com.example.todoapplication.repository;

import com.example.todoapplication.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoItemRepo extends JpaRepository<ToDoItem, Long> {

}
