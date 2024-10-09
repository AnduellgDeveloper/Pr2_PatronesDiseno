package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.sistemaOperativos;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ISistemaOperativo;

public class IOS implements ISistemaOperativo {
    @Override
    public void especificarSO() {
        System.out.println("Sistema Operativo IOS de Gama Alta");
    }
}
