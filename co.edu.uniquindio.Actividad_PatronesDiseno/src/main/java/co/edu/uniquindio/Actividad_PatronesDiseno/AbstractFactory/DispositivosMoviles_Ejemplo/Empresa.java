package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.factorys.FabricaGamaAlta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.factorys.FabricaGamaBaja;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.IDispositivoFactory;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ITableta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ITelefono;

public class Empresa {
    public static void main(String[] args){

        System.out.println("Lote de Gama Alta");

        IDispositivoFactory fabricaGamaAlta = new FabricaGamaAlta();
        // Telefono Gama Alta
        ITelefono telefonoAltaGama = fabricaGamaAlta.crearTelefono();
        telefonoAltaGama.especificarTelefono();
        // Tableta Gama Alta
        ITableta tabletaGamaAlta = fabricaGamaAlta.crearTableta();
        tabletaGamaAlta.especificarTableta();

        System.out.println("Lote de Gama Baja");

        IDispositivoFactory fabricaGamaBaja = new FabricaGamaBaja();

        // Telefono de Gama Baja
        ITelefono telefonoGamaBaja = fabricaGamaBaja.crearTelefono();
        telefonoGamaBaja.especificarTelefono();

        // Tableta de Gama Baja
        ITableta tabletaGamaBaja = fabricaGamaBaja.crearTableta();
        tabletaGamaBaja.especificarTableta();
    }
}
