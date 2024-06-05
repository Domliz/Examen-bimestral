package org.example;

import javax.persistence.*;
import java.util.List;

public class Main {
   public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
       EntityManager em = emf.createEntityManager();

       em.getTransaction().begin();

       Autor autor = new Autor("Alexandra Dumas");
       Libro libro1 = new Libro("El conde de Montecristo");
       Libro libro2 = new Libro("Los Tres Mosqueteros");

       autor.agregarLibro(libro1);
       autor.agregarLibro(libro2);

       em.persist(autor);

       em.getTransaction().commit();

       // Verificar los datos persisitidos
       List<Autor> autores = em.createQuery("from Autor", Autor.class).getResultList();
       for (Autor a : autores) {
           System.out.println("Autor: " + a.getNombre());
           for (Libro l : a.getLibros()){
               System.out.println("Libro: " + l.getTitulo());
           }
       }

       em.close();
       em.close();
    }
}