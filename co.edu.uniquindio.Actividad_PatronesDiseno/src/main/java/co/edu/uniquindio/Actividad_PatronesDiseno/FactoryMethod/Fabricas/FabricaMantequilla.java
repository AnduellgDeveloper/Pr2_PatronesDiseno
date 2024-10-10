package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.Fabricas;


import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos.Mantequilla;
import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos.ProductoLacteo;

public class FabricaMantequilla extends FabricaDeLacteos {
    @Override
    public ProductoLacteo crearProductoLacteo() {
        return new Mantequilla();
    }
}
