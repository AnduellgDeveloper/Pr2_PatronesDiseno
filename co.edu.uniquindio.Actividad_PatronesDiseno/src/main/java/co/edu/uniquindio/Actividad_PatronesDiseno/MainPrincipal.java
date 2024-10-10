package co.edu.uniquindio.Actividad_PatronesDiseno;


import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.EmpresaMoviles;
import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.EmpresaLacteos;
import co.edu.uniquindio.Actividad_PatronesDiseno.Prototype.AdministradorPrototype;

public class MainPrincipal {
    public static void main(String[] args) {
        try {
            // Llamada al main de EmpresaMoviles
            System.out.println("\n===================== ABSTRACT FACTORY =====================\n");
            EmpresaMoviles.main(args);
            Thread.sleep(5000);
            // Llamada al main de EmpresaLacteos
            System.out.println("\n===================== FACTORY METHOD =====================\n");
            EmpresaLacteos.main(args);
            Thread.sleep(5000);

            // Llamada al main de AdministradorPrototype
            System.out.println("\n===================== PROTOTYPE =====================\n");
            AdministradorPrototype.main(args);

        } catch (InterruptedException e) {
            System.out.println("Error en la pausa del hilo: " + e.getMessage());
        }
    }
}
