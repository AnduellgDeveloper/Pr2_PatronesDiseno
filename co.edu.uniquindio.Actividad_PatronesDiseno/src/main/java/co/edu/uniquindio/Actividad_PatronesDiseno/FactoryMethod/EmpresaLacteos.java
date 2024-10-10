package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod;

import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.Fabricas.FabricaDeLacteos;
import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.Fabricas.FabricaLeche;
import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.Fabricas.FabricaMantequilla;
import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.Fabricas.FabricaYogur;
import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos.ProductoLacteo;

public class EmpresaLacteos {
    public static void main(String[] args){
        FabricaDeLacteos fabrica;
        ProductoLacteo producto;

        // Crear leche
        fabrica = new FabricaLeche();
        producto = fabrica.crearProductoLacteo();
        producto.procesar();
        producto.mostrarDetalles();

        // Crear yogur
        fabrica = new FabricaYogur();
        producto = fabrica.crearProductoLacteo();
        producto.procesar();
        producto.mostrarDetalles();

        // Crear Mantequilla
        fabrica = new FabricaMantequilla();
        producto = fabrica.crearProductoLacteo();
        producto.procesar();
        producto.mostrarDetalles();

        // Crear Queso
        fabrica = new FabricaMantequilla();
        producto = fabrica.crearProductoLacteo();
        producto.procesar();
        producto.mostrarDetalles();

    }

}
