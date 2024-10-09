package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo.services.IBateria;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo.services.IProcesador;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo.services.ISistemaOperativo;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.CelularesEjemplo.services.ITelefono;

public class TelefonoGamaAlta implements ITelefono {
    private ISistemaOperativo sistemaOperativo;
    private IProcesador procesador;
    private IBateria bateria;

    public TelefonoGamaAlta(ISistemaOperativo sistemaOperativo, IProcesador procesador, IBateria bateria) {
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.bateria = bateria;
    }

    @Override
    public void especificarTelefono() {
        System.out.println("Telefono de alta gama");
        sistemaOperativo.especificarSO();
        procesador.especificarProcesador();
        bateria.especificarBateria();
    }
}
