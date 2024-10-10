package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos;

public class Yogur extends ProductoLacteo{
    public Yogur() {
        this.tipo = "Yogur";
        this.volumen = 0.5;
        this.contenidoGraso = 4.0;
    }
    public void procesar() {
        System.out.println("Fermentando y empaquetando yogur.");
    }
}
