package com.libcode.gimnasio.modelo;

import jakarta.persistence.*;
import java.util.List;
import com.libcode.gimnasio.modelo.Clase;

@Entity
public class Entrenador {
    @Id
    private String dui;

    private String nombre;

    @OneToMany(mappedBy = "entrenador")
    private List<Clase> clases;

    // Getters y setters
}