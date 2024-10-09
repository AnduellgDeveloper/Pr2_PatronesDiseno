package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.sistemaOperativos;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ISistemaOperativo;

public class Android implements ISistemaOperativo {

    @Override
    public void especificarSO() {
        System.out.println("Andorid para sistema operativo gama baja");
    }
}
