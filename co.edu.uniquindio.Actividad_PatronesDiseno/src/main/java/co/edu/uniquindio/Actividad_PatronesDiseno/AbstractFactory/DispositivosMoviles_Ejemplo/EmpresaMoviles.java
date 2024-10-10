package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo;

import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.factorys.FabricaGamaAlta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.factorys.FabricaGamaBaja;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.IDispositivoFactory;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ITableta;
import co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services.ITelefono;

public class EmpresaMoviles {
    public static void main(String[] args) {

        System.out.println("****************************************");
        System.out.println("🚀 Bienvenidos a la Fábrica de Dispositivos Móviles");
        System.out.println("****************************************\n");

        // Lote de Gama Alta
        System.out.println("📱 Lote de Dispositivos de Gama Alta 🔝");
        System.out.println("========================================");

        IDispositivoFactory fabricaGamaAlta = new FabricaGamaAlta();

        // Telefono Gama Alta
        ITelefono telefonoAltaGama = fabricaGamaAlta.crearTelefono();
        System.out.println("\n📞 Creando Teléfono de Gama Alta:");
        telefonoAltaGama.especificarTelefono();

        // Tableta Gama Alta
        ITableta tabletaGamaAlta = fabricaGamaAlta.crearTableta();
        System.out.println("\n📟 Creando Tableta de Gama Alta:");
        tabletaGamaAlta.especificarTableta();

        // Separador entre lotes
        System.out.println("\n----------------------------------------\n");

        // Lote de Gama Baja
        System.out.println("📱 Lote de Dispositivos de Gama Baja 🔻");
        System.out.println("========================================");

        IDispositivoFactory fabricaGamaBaja = new FabricaGamaBaja();

        // Telefono Gama Baja
        ITelefono telefonoGamaBaja = fabricaGamaBaja.crearTelefono();
        System.out.println("\n📞 Creando Teléfono de Gama Baja:");
        telefonoGamaBaja.especificarTelefono();

        // Tableta Gama Baja
        ITableta tabletaGamaBaja = fabricaGamaBaja.crearTableta();
        System.out.println("\n📟 Creando Tableta de Gama Baja:");
        tabletaGamaBaja.especificarTableta();

        System.out.println("\n****************************************");
        System.out.println("🏁 Finalización del Proceso de Creación");
        System.out.println("****************************************");
    }
}

