package co.edu.uniquindio.Actividad_PatronesDiseno.AbstractFactory.DispositivosMoviles_Ejemplo.services;
// Asbtract Factory
public interface IDispositivoFactory {
    ITelefono crearTelefono();
    ITableta crearTableta();
}
