package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos;

public class Queso extends ProductoLacteo{
    public Queso() {
        this.tipo = "Queso";
        this.volumen = 0.3;
        this.contenidoGraso = 25.0;
    }
    @Override
    public void procesar() {
        System.out.println("Madurando y empaquetando queso.");
    }
}
