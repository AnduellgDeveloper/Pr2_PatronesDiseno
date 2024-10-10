package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.dispositivos;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IBateria;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IProcesador;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.ISistemaOperativo;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.ITableta;

public class TabletaGamaBaja implements ITableta {
    private ISistemaOperativo sistemaOperativo;
    private IProcesador procesador;
    private IBateria bateria;

    public TabletaGamaBaja(ISistemaOperativo sistemaOperativo, IProcesador procesador, IBateria bateria) {
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.bateria = bateria;
    }

    @Override
    public void especificarTableta() {
        System.out.println("Tableta de gama baja:");
        sistemaOperativo.especificarSO();
        procesador.especificarProcesador();
        bateria.especificarBateria();
    }
}
