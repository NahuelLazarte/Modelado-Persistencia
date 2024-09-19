package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
}
