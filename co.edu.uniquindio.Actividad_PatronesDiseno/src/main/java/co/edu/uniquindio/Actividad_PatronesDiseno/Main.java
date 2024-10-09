package co.edu.uniquindio.Actividad_PatronesDiseno;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CastilloEjemplo.Model.CastilloGotico;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CastilloEjemplo.Model.CastilloMedieval;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CastilloEjemplo.Model.CastilloRenacientista;
import co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.TarjetaCreditoB;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory \n");
        System.out.println("Castillo Gotico");
        CastilloGotico castillo = new CastilloGotico();
        castillo.crearPared();
        castillo.crearVentana();
        castillo.crearPuerta();
        castillo.crearSimbolismoReligioso();
        castillo.crearGargolas();
        castillo.crearArcosApuntados();

        System.out.println(" \n Castillo Medieval");



        CastilloMedieval castillo2 = new CastilloMedieval();
        castillo2.crearPared();
        castillo2.crearVentana();
        castillo2.crearPuerta();
        castillo2.crearFozo();
        castillo2.torreDeVigilancia();
        castillo2.crearPuenteLevadizo();
        System.out.println("\n Castillo Renacientista");
        CastilloRenacientista castillo3 = new CastilloRenacientista();
        castillo3.crearPared();
        castillo3.crearVentana();
        castillo3.crearPuerta();
        castillo3.crearDecoracionOrnamental();
        castillo3.crearPatioInterior();
        castillo3.crearDecoracionOrnamental();
        System.out.println(" \n Prototype");
        TarjetaCreditoB tarjeta = new TarjetaCreditoB("Andrea V Martinez",234,"12345678901");
        



    }




}







