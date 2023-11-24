package costazul;


public class NodoLista {
    String Nombre;
    NodoLista siguiente;

    public NodoLista(String contenido) {
        this.Nombre = contenido;
        this.siguiente = null;
    }
}
