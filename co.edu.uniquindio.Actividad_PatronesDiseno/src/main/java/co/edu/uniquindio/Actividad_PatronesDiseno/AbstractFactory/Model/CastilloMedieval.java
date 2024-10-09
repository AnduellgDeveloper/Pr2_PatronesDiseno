package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.Model;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.ICastilloFactory;



public class CastilloMedieval implements ICastilloFactory {


    public void torreDeVigilancia(){
        System.out.println("Torre de vigilancia");
    }
    public void crearPuenteLevadizo(){
        System.out.println("Creando Puente Levadizo");
    }
    public void crearFozo() {
        System.out.println("Creando Fozo");

    }

    @Override
    public void crearPared() {
        System.out.println("Creando Pared castillo medieval");

    }

    @Override
    public void crearVentana(){
        System.out.println("Creando Ventana castillo medieval");

    }



    @Override
    public void crearPuerta() {
        System.out.println("Creando Puerta castillo medieval");

    }
}
