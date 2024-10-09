package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo.services.IBateria;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo.services.IProcesador;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo.services.ISistemaOperativo;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo.services.ITableta;

public class TabletaGamaAlta implements ITableta {
    private ISistemaOperativo sistemaOperativo;
    private IProcesador procesador;
    private IBateria bateria;

    public TabletaGamaAlta(ISistemaOperativo sistemaOperativo, IProcesador procesador, IBateria bateria) {
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.bateria = bateria;
    }

    @Override
    public void especificarTableta() {
        System.out.println("Tableta de alta gama:");
        sistemaOperativo.especificarSO();
        procesador.especificarProcesador();
        bateria.especificarBateria();
    }
}
