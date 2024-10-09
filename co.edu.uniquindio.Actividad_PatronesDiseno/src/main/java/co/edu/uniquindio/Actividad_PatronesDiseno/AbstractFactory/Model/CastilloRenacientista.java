package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.Model;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.ICastilloFactory;

public class CastilloRenacientista implements ICastilloFactory {

    public void crearVentanal(){
        System.out.println("Creando Ventanal");

    }
    public void crearDecoracionOrnamental(){
        System.out.println("Creando Decoracion Ornamental");

    }
    public void crearPatioInterior(){
        System.out.println("Creando Patio Interior");
    }


    @Override
    public void crearPared() {
        System.out.println("Creando pared en castillo renacientista");
    }

    @Override
    public void crearVentana() {
        System.out.println("Creando ventana en castillo renacientista");

    }

    @Override
    public void crearPuerta() {
        System.out.println("Creando puerta en castillo renacientista");

    }
}
