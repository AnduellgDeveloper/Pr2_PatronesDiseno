package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.dispositivos;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IBateria;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.IProcesador;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.ISistemaOperativo;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.services.ITelefono;

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
        System.out.println("Telefono de gama alta");
        sistemaOperativo.especificarSO();
        procesador.especificarProcesador();
        bateria.especificarBateria();
    }
}
