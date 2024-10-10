package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.sistemaOperativos;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.ISistemaOperativo;

public class Android implements ISistemaOperativo {

    @Override
    public void especificarSO() {
        System.out.println("Andorid para sistema operativo gama baja");
    }
}
