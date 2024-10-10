package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.factorys;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.sistemaOperativos.Android;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.hardware.Bateria2500mAh;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.hardware.ProcesadorSnapdragon450;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.dispositivos.TabletaGamaBaja;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.dispositivos.TelefonoGamaBaja;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IDispositivoFactory;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.ITableta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.ITelefono;

public class FabricaGamaBaja implements IDispositivoFactory {
    @Override
    public ITelefono crearTelefono() {
        return new TelefonoGamaBaja(new Android(), new ProcesadorSnapdragon450(), new Bateria2500mAh());
    }

    @Override
    public ITableta crearTableta() {
        return new TabletaGamaBaja(new Android(), new ProcesadorSnapdragon450(), new Bateria2500mAh ());
    }
}
