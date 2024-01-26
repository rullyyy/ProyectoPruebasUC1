/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author xfs85
 */
@Entity
@Table(name = "Task")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Basic
    @Column(name = "name")
    private String name;
    
    @Basic
    @Column(name = "finalDate")
    
    @Temporal(TemporalType.DATE)
    private Date finalDate;
    
    @Basic
    @Column(name = "inicialDate")
    @Temporal(TemporalType.DATE)
    private Date inicialDate;
    
    @Basic
    @Column(name = "color")
    private String color;

    public Task() {
    }

    public Task(Long id, String name, Date finalDate, Date inicialDate, String color) {
        this.id = id;
        this.name = name;
        this.finalDate = finalDate;
        this.inicialDate = inicialDate;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public Date getInicialDate() {
        return inicialDate;
    }

    public void setInicialDate(Date inicialDate) {
        this.inicialDate = inicialDate;
    }

   
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
