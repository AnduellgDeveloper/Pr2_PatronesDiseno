package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.hardware;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IProcesador;

public class ProcesadorM1 implements IProcesador {
    @Override
    public void especificarProcesador() {
        System.out.println("Procesador M1 de Gama Alta");
    }
}
