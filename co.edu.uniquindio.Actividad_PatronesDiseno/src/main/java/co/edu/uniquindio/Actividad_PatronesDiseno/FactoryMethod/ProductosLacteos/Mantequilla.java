package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos;

public class Mantequilla extends ProductoLacteo{
    public Mantequilla() {
        this.tipo = "Mantequilla";
        this.volumen = 0.25;
        this.contenidoGraso = 80.0;
    }
    public void procesar() {
        System.out.println("Batir crema y empaquetando mantequilla.");
    }
}
