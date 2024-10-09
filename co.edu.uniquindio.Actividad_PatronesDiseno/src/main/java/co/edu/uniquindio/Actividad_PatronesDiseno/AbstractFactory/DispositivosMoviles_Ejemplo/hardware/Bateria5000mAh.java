package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.hardware;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.IBateria;

public class Bateria5000mAh implements IBateria {
    @Override
    public void especificarBateria() {
        System.out.println("Bateria Gama Alta");
    }
}
