package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity @Table(name = "producto")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo")
public abstract class Producto {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "marca_id", referencedColumnName = "id")
    private Marca marca;

    public Producto() {

    }

    public Double precio() {

        return 0.0;
    }

    public Integer stock() {

        return 0;
    }
}
