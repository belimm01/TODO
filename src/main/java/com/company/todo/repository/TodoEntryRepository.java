package com.company.todo.repository;

import com.company.todo.model.TodoEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoEntryRepository extends JpaRepository<TodoEntry, Long> {

     List<TodoEntry> findAll();
}