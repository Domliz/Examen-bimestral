package org.example;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "autor_id")
    private Set<Libro> libros = new HashSet<>();

    // Constructor, getters y setters
    public Autor() {
    }

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }
}