package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.Fabricas;

import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos.Leche;
import co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos.ProductoLacteo;

public class FabricaLeche extends FabricaDeLacteos {
    public ProductoLacteo crearProductoLacteo() {
        return new Leche();
    }
}
