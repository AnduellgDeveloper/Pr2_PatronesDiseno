package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.hardware;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.IProcesador;

public class ProcesadorM1 implements IProcesador {
    @Override
    public void especificarProcesador() {
        System.out.println("Procesador M1 de Gama Alta");
    }
}
