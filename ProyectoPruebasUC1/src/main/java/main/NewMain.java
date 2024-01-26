/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Persistencia.ListJpaController;
import Persistencia.SingletonEntityManager;
import Persistencia.TaskJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import model.Task;

/**
 *
 * @author xfs85
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    TaskJpaController controller = new TaskJpaController();
    Task t = new Task();
    
    t.setName("Raúl");
    
    controller.create(t);
      
      
      
    }
    
}
