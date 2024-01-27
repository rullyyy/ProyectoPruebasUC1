/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author xfs85
 */
@Entity
@Table (name = "List")
public class ToDoList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
   @OneToMany(mappedBy = "toDoList", cascade = CascadeType.ALL)
    private List<Task> tasks;

    public ToDoList() {
    }

    public ToDoList(Long id, List<Task> tasks) {
        this.id = id;
        this.tasks = tasks;
    }

    public void agrega(Task taskToAdd){
        this.tasks.add(taskToAdd);

    }

    public void printTasks(){
        for (Task t: tasks){
            System.out.println(t.getName());
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(java.util.List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
