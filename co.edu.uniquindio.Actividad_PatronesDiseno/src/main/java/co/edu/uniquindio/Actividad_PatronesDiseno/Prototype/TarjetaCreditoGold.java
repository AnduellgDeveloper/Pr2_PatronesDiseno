package co.edu.uniquindio.Actividad_PatronesDiseno.Prototype;

import co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.Services.IPrototipo;

public class TarjetaCreditoGold extends TarjetaCreditoB implements IPrototipo {
    public TarjetaCreditoGold(String nombreTitular, int cvv, String numeroTarjeta) {
        super(nombreTitular, cvv, numeroTarjeta);
    }
    @Override
    public IPrototipo clonar() {
        return new TarjetaCreditoGold(nombreTitular,cvv,numeroTarjeta) ;


    }
    @Override
    public String toString() {
        return "Tarjeta Gold: " + super.toString();
    }


}
