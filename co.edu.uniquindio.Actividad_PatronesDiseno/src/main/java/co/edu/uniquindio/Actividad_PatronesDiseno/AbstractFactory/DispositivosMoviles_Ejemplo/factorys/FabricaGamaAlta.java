package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.factorys;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.sistemaOperativos.IOS;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.hardware.Bateria5000mAh;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.hardware.ProcesadorM1;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.dispositivos.TabletaGamaAlta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.dispositivos.TelefonoGamaAlta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.IDispositivoFactory;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ITableta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ITelefono;

public class FabricaGamaAlta implements IDispositivoFactory {
    @Override
    public ITelefono crearTelefono() {
        return new TelefonoGamaAlta(new IOS(), new ProcesadorM1(), new Bateria5000mAh());
    }

    @Override
    public ITableta crearTableta() {
        return new TabletaGamaAlta(new IOS(), new ProcesadorM1(), new Bateria5000mAh());
    }
}
