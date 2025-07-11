package uade.edu.ar.Cocinapp.Entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.nio.file.Path;

@Entity
@Getter
@Setter
@Table(name = "cronogramaCursos")
public class CronogramaCurso { // cuando y donde se dicta ese curso, con cupos
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCronograma;

    // relacion con curso
    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;

    // relacion con sede
    @ManyToOne
    @JoinColumn(name = "idSede")
    private Sede sede;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private int vacantesDisponibles;
    
    //Los QR se generan por cronograma, cada QR está en la tabla 'Multimedia' con su url y id.
    @Lob
    private String qRid;
}
