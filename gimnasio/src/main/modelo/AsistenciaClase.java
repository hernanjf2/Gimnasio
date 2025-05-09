package com.libcode.gimnasio.modelo;

import jakarta.persistence.*;
import java.time.LocalDateTime;
// Removed unnecessary import for Clase as it is in the same package
// Correctly import the Miembro class
import com.libcode.gimnasio.modelo.Miembro;

@Entity
public class AsistenciaClase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Reference to the Miembro class
    private Miembro miembro; // Ensure Miembro class is defined and accessible
    private Miembro miembro;

    @ManyToOne
    @JoinColumn(name = "clase_id")
    private Clase clase;

    private LocalDateTime fechaAsistencia;

    // Getters y setters
}