package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.factorys;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.sistemaOperativos.Android;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.hardware.Bateria2500mAh;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.hardware.ProcesadorSnapdragon450;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.dispositivos.TabletaGamaBaja;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.dispositivos.TelefonoGamaBaja;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.IDispositivoFactory;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ITableta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ITelefono;

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
