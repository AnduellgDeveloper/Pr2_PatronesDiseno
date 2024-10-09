package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.IDispositivoFactory;

public class FabricaGamaBaja implements IDispositivoFactory {

    @Override
    public void crearTelefono() {
        System.out.println("Creando telefono Gama Baja");

    }

    @Override
    public void crearTableta() {
        System.out.println("Creando tableta Gama Baja");

    }
}
