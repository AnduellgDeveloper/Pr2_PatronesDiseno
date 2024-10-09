package co.edu.uniquindio.Actividad_PatronesDiseno.Prototype;

import co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.Services.IPrototipo;

public class TarjetaCreditoBlack extends TarjetaCreditoB implements IPrototipo {
    public TarjetaCreditoBlack(String nombreTitular, int cvv, String numeroTarjeta) {
        super(nombreTitular, cvv, numeroTarjeta);
    }


}
