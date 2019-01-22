/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author mati
 */
public class Profesor implements Serializable {

    private int id;
    private Nombre nombre;
    private TipoFuncionario tipoFuncionario;

    public Profesor() {
    }

    public Profesor(Nombre nombre, TipoFuncionario tipo) {
        this.nombre = nombre;
        this.tipoFuncionario = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

}
