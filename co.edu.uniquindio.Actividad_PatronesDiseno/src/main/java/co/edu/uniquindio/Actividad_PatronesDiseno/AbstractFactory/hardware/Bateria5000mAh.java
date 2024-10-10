package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.hardware;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IBateria;

public class Bateria5000mAh implements IBateria {
    @Override
    public void especificarBateria() {
        System.out.println("Bateria Gama Alta");
    }
}
