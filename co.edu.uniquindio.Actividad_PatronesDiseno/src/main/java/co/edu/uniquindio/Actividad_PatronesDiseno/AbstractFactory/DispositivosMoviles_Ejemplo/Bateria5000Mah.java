package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.IBateria;

public class Bateria5000Mah implements IBateria {
    @Override
    public void especificarBateria() {
        System.out.println("Bateria  Gama Alta");
    }
}
