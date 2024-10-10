package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos;

public abstract class ProductoLacteo {
    String tipo;
    double volumen;
    double contenidoGraso;
    public abstract void procesar();

    public void mostrarDetalles() {
        System.out.println("=================================");
        System.out.println("      Detalles del Producto      ");
        System.out.println("=================================");
        System.out.println("Tipo:            " + tipo);
        System.out.println("Volumen:         " + volumen + " litros/kilos");
        System.out.println("Contenido Graso: " + contenidoGraso + " %");
        System.out.println("=================================\n");
    }
}
