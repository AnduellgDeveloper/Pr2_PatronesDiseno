package co.edu.uniquindio.Actividad_PatronesDiseno.Prototype;

import co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.Services.IPrototipo;

public class TarjetaCreditoBlack extends TarjetaCreditoB implements IPrototipo {
    public TarjetaCreditoBlack(String nombreTitular, int cvv, String numeroTarjeta) {
        super(nombreTitular, cvv, numeroTarjeta);

    }
    @Override
    public IPrototipo clonar() {
        return new TarjetaCreditoBlack(nombreTitular,cvv,numeroTarjeta) ;


    }
    @Override
    public String toString() {
        return "Tarjeta Black: " + super.toString();
    }



}
