package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.hardware;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IProcesador;

public class ProcesadorSnapdragon450 implements IProcesador {
    @Override
    public void especificarProcesador() {
        System.out.println("Procesador Snapdragon 450 para dispositivos gama baja");
    }
}
