/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Calendar;
import java.util.List;
import model.Alumno;
import model.Profesor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Maite
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Query query = session.createQuery("SELECT p FROM Profesor p");
        List<Profesor> profesores = query.list();

        for (int i = 0; i < profesores.size(); i++) {
            System.out.println(profesores.get(i));
        }

        query = session.createQuery("SELECT p.id,p.nombre FROM Profesor p");
        List<Object[]> arrayObjetos = query.list();

        for (int i = 0; i < arrayObjetos.size(); i++) {
            System.out.println(arrayObjetos.get(i)[0] + " " + arrayObjetos.get(i)[1]);
        }

        query = session.createQuery("SELECT p.nombre FROM Profesor p");
        List<Object> arrayObjects = query.list();
        for (int i = 0; i < arrayObjects.size(); i++) {
            System.out.println(arrayObjects.get(i));
        }

        //Unique result
        Profesor profesor = (Profesor) session.createQuery("SELECT p FROM Profesor p WHERE p.id=2").uniqueResult();
        System.out.println("Unico " + profesor);

        //Paginación
        int tamanyoPagina = 2;
        int paginaAMostrar = 1;
        query = session.createQuery("SELECT p FROM Profesor p Order By p.id");
        query.setMaxResults(tamanyoPagina);
        query.setFirstResult(paginaAMostrar);
        List<Object> arrayProfesores = query.list();
        for (int i = 0; i < arrayProfesores.size(); i++) {
            System.out.println(arrayProfesores.get(i));
        }
        //Consulta con nombres
        query = session.getNamedQuery("findAllProfesores");
        profesores = query.list();
        for (int i = 0; i < profesores.size(); i++) {
            System.out.println(profesores.get(i));
        }
        
        //Query con ?
        String nombre="Maite";
        String ape1="Chirivella";
        String ape2="Hola";
        query=session.createQuery("SELECT p FROM Profesor p WHERE nombre=? AND ape1=? AND ape2=?");
        query.setString(0, nombre);
        query.setString(1, ape1);
        query.setString(2, ape2);
        profesores=query.list();
        for (int i = 0; i < profesores.size(); i++) {
            System.out.println(profesores.get(i));
        }
        
        
        session.close();
        factory.close();

    }

}
