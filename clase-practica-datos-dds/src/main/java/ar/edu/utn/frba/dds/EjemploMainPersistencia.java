package ar.edu.utn.frba.dds;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;

public class EjemploMainPersistencia implements WithSimplePersistenceUnit {
    
    public static void main(String[] args) {
        /*
        PruebaPersistencia prueba = new PruebaPersistencia();
        prueba.setNombre("ejemplo");

        Repositorio repositorio = new Repositorio();

        repositorio.guardar(prueba);*/
        EjemploMainPersistencia instance = new EjemploMainPersistencia();

        instance.impactarEnBase();
    }
    public void impactarEnBase(){//esto quizás haya que usarlo para los test (porque no se persite en el servidor)
        withTransaction(() -> {

        });
    }
}
