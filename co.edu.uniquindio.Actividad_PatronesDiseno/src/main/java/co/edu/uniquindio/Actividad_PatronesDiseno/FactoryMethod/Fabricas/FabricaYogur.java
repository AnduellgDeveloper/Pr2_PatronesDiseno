package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.Fabricas;

import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos.ProductoLacteo;
import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos.Yogur;

public class FabricaYogur extends FabricaDeLacteos {

    @Override
    public ProductoLacteo crearProductoLacteo() {
        return new Yogur();
    }
}
