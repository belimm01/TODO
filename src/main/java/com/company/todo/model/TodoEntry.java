package com.company.todo.model;

import javax.persistence.*;

@Entity
@Table(name="todos")
public class TodoEntry {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="todos_id")
    private Long id;
    @Column(name="todos_name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
