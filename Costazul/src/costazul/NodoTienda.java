package costazul;

public class NodoTienda {
    String Tienda;
    String Encargado;
    String Rubro;
    NodoTienda siguiente;

    public NodoTienda(String contenidoTien, String contenidoEncar, String contenidoRubro) {
        this.Tienda = contenidoTien;
        this.Encargado= contenidoEncar;
        this.Rubro=contenidoRubro;
        this.siguiente = null;
    }
}
