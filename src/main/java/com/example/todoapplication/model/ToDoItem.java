package com.example.todoapplication.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "todoitem")
public class ToDoItem {
    //Long stores 2^63; Int 2^31
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Boolean isDone;

    public ToDoItem(Long id, String description, Boolean isDone) {
        this.id = id;
        this.description = description;
        this.isDone = isDone;
    }

    public ToDoItem(String description, Boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public ToDoItem() {
    }
}
