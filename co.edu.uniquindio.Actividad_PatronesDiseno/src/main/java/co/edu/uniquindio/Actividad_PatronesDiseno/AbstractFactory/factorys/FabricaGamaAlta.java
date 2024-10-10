package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.factorys;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.sistemaOperativos.IOS;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.hardware.Bateria5000mAh;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.hardware.ProcesadorM1;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.dispositivos.TabletaGamaAlta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.dispositivos.TelefonoGamaAlta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IDispositivoFactory;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.ITableta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.ITelefono;

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
