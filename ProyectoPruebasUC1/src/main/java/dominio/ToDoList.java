/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author xfs85
 */
@Entity
public class ToDoList implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(mappedBy = "tasks", cascade = CascadeType.ALL)
    private List<Task> tasks = new ArrayList<>();

    
    public ToDoList() {
    }


    public void agrega(Task taskToAdd){
        this.tasks.add(taskToAdd);

    }

    public void printTasks(){
        for (Task t: tasks){
            System.out.println(t.getName());
        }
    }

}
