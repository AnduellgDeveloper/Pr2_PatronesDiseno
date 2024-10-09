package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.Model;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.ICastilloFactory;

public class CastilloGotico implements ICastilloFactory {

    public void crearGargolas(){
        System.out.println("Creando Gargolas...");

    }
    public void crearSimbolismoReligioso(){
        System.out.println("Creando Simbolismo Religioso...");


    }
    public void crearArcosApuntados(){
        System.out.println("Creando Arcos Apuntados...");

    }

    @Override
    public void crearPared() {
        System.out.println("Creando pared castillo gotico");

    }

    @Override
    public void crearVentana() {
        System.out.println("Creando ventana castillo gotico");

    }

    @Override
    public void crearPuerta() {
        System.out.println("Creando puerta castillo gotico");

    }
}
