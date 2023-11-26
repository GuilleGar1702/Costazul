package costazul;


public class NodoLista {
    int Cedula;
    String Nombre;
    String Apellido;
    String Marca;
    String Matricula;
    String Color;
    String Vehiculo;
    String Seccion;
    NodoLista siguiente;

    public NodoLista(int contenidoCedu, String contenidoNom, String contenidoApe, String contenidoMar, String contenidoMatri, String contenidoColor, String contenidoVehi, String contenidoSec) {
        this.Cedula = contenidoCedu;
        this.Nombre = contenidoNom;
        this.Apellido= contenidoApe;
        this.Marca=contenidoMar;
        this.Matricula=contenidoMatri;
        this.Color=contenidoColor;
        this.Vehiculo=contenidoVehi;
        this.Seccion=contenidoSec;
        this.siguiente = null;
    }
}
