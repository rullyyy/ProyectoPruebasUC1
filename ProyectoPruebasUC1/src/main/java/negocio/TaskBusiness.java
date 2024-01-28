/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import Persistencia.TaskJpaController;
import dominio.Task;

/**
 *
 * @author waw
 */
public class TaskBusiness {
    
    public Task create(Task task){
        TaskJpaController taskJpa = new TaskJpaController();
        
        return taskJpa.create(task);
    }
}
