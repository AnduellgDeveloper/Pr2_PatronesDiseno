package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.hardware;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IBateria;

public class Bateria2500mAh implements IBateria {
    @Override
    public void especificarBateria() {
        System.out.println("Batria de 2500mAh para dispositivios gama baja");

    }
}
