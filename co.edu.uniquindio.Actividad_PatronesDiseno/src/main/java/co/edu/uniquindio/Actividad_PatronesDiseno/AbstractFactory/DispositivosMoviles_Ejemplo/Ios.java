package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ISistemaOperativo;

public class Ios implements ISistemaOperativo {
    @Override
    public void especificarSO() {
        System.out.println("Sistema Operativo Gama Alta");
    }
}
