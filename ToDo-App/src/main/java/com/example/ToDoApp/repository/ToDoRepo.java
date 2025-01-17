package com.example.ToDoApp.repository;

import com.example.ToDoApp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo extends JpaRepository<ToDo, Long> {

}
