package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.Fabricas;

import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos.ProductoLacteo;
import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos.Queso;

public class FabricaQueso extends FabricaDeLacteos {
    @Override
    public ProductoLacteo crearProductoLacteo() {
        return new Queso();
    }
}
