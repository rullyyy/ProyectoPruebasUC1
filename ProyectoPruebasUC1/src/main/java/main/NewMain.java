/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import GUI.ToDoFrm;
import Persistencia.ListJpaController;
import Persistencia.SingletonEntityManager;
import Persistencia.TaskJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import dominio.Task;

/**
 *
 * @author xfs85
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    new ToDoFrm().setVisible(true);
      
      
      
    }
    
}
