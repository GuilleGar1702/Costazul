package costazul;

public class NodoTienda {
    String Tienda;
    String Encargado;
    String Rubro;
    String[] Productos= new String[3];
    NodoTienda siguiente;

    public NodoTienda(String contenidoTien, String contenidoEncar, String contenidoRubro, String[] contenidoProduc) {
        this.Tienda = contenidoTien;
        this.Encargado= contenidoEncar;
        this.Rubro=contenidoRubro;
        this.Productos= contenidoProduc;
        this.siguiente = null;
    }
}
