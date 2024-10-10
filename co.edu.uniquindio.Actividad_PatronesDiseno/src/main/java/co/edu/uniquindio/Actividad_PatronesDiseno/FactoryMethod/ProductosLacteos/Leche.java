package co.edu.uniquindio.Actividad_PatronesDiseno.FactoryMethod.ProductosLacteos;

public class Leche extends ProductoLacteo{
    public Leche() {
        this.tipo = "Leche";
        this.volumen = 1.0;
        this.contenidoGraso = 3.5;

    }
    @Override
    public void procesar() {
        System.out.println("Pasteurizando y empaquetando leche");
    }
}
