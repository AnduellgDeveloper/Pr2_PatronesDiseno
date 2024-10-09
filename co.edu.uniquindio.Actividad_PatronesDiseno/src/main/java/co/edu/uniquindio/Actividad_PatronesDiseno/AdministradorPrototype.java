package co.edu.uniquindio.Actividad_PatronesDiseno;

import co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.TarjetaCreditoB;
import co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.TarjetaCreditoBlack;
import co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.TarjetaCreditoGold;

public class AdministradorPrototype {
    public static void main(String[] args) {
   System.out.println("\n======= PROTOTYPE =======\n");

    // Crear un objeto original de TarjetaCreditoB
    TarjetaCreditoB tarjeta = new TarjetaCreditoB("Andrea V Martinez", 234, "12345678901");
    TarjetaCreditoB tarjetaClonada = (TarjetaCreditoB) tarjeta.clonar();
        tarjetaClonada.setNombreTitular("Andres F Moreno");
        tarjetaClonada.setNumeroTarjeta("23456790123");
        tarjetaClonada.setCvv(213);

    // Crear un objeto original de TarjetaCreditoBlack
    TarjetaCreditoBlack tarjeta1 = new TarjetaCreditoBlack("Nicol D Marin", 478, "1258901235");
    TarjetaCreditoBlack tarjetaClonada1 = (TarjetaCreditoBlack) tarjeta1.clonar();
        tarjetaClonada1.setNombreTitular("Duvan F Palomares");
        tarjetaClonada1.setCvv(234);
        tarjetaClonada1.setNumeroTarjeta("1247289038475");

    // Crear un objeto original de TarjetaCreditoGold
    TarjetaCreditoGold tarjeta2 = new TarjetaCreditoGold("Sofia O Benitez", 190, "34567123091");
    TarjetaCreditoGold tarjetaClonada2 = (TarjetaCreditoGold) tarjeta2.clonar();
        tarjetaClonada2.setNombreTitular("Damian B Artemis");
        tarjetaClonada2.setCvv(900);
        tarjetaClonada2.setNumeroTarjeta("1256789023567");

    // Formatear la salida con líneas separadoras
        System.out.println("------- Tarjeta Crédito Básica -------");
        System.out.println("Original:");
        System.out.println(tarjeta);
        System.out.println("Clonada:");
        System.out.println(tarjetaClonada);
        System.out.println("--------------------------------------\n");

        System.out.println("------- Tarjeta Crédito Black --------");
        System.out.println("Original:");
        System.out.println(tarjeta1);
        System.out.println("Clonada:");
        System.out.println(tarjetaClonada1);
        System.out.println("--------------------------------------\n");

        System.out.println("-------- Tarjeta Crédito Gold --------");
        System.out.println("Original:");
        System.out.println(tarjeta2);
        System.out.println("Clonada:");
        System.out.println(tarjetaClonada2);
        System.out.println("--------------------------------------\n");
}
}
