package com.example.todoapplication.controller;

import com.example.todoapplication.model.ToDoItem;
import com.example.todoapplication.service.ToDoItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todoitems")
@AllArgsConstructor
@CrossOrigin("http://localhost:3000")
public class ToDoItemController {

    private final ToDoItemService toDoItemService;

    // front-end ------>> java-server
    //HttpRequest ----->> Controller ----->>Service ----> Repo
    // Front End <------- Controller <------ Service<-----

    @GetMapping
    public ResponseEntity<?> fetchAllToDoItems(){
        List<ToDoItem> toDoItems = toDoItemService.fetchAllToDoItems();

        //retur  ResponseEntity..ok(toDoItems); -->> shortcut
        return ResponseEntity.status(HttpStatus.OK).body(toDoItems);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateToDoItem(@RequestBody ToDoItem toDoItem){
     ToDoItem updatedToDoItem = toDoItemService.updateToDoItem(toDoItem);

        return ResponseEntity.ok(updatedToDoItem);
    }
}
