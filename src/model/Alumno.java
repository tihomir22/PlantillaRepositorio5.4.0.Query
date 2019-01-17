/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author mati
 */
public class Alumno {

    private int id;
    private String nombre;
    private Float sueldo;
    private boolean registrado;
    private Date fechanacimiento;
    private Date horatutoria;
    private Date fecharegistro;
    private String observaciones;

    public Alumno(int id, String nombre, Float sueldo, boolean registrado, Date fechanacimiento, Date horatutoria, Date fecharegistro, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.registrado = registrado;
        this.fechanacimiento = fechanacimiento;
        this.horatutoria = horatutoria;
        this.fecharegistro = fecharegistro;
        this.observaciones = observaciones;
    }

    public Alumno() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public boolean getRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Date getHoratutoria() {
        return horatutoria;
    }

    public void setHoratutoria(Date horatutoria) {
        this.horatutoria = horatutoria;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
