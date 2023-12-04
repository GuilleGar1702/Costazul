
package costazul.arbol;

/**
 *
 * @author Guillermo
 */
public class NodoArbol {
    String nombre;
    String apellido;
    public String cedula;
    String matricula;
    String tipoDeVehiculo;
    String marcaVehiculo;
    String colorVehiculo;
    String horaEntrada;
    String horaSalida;
    char seccion;
    int puesto;
    int altura;

    NodoArbol izquierda, derecha;

    public NodoArbol(String nombre, String apellido, String cedula, String matricula, String tipoDeVehiculo, String marcaVehiculo, String colorVehiculo, String horaEntrada, String horaSalida, char seccion, int puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.matricula = matricula;
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.colorVehiculo = colorVehiculo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.seccion = seccion;
        this.puesto = puesto;
        this.altura = 1;
    }
    
    public void imprimirNodo(){
        System.out.println(puesto + "-" + seccion + " " + nombre + " " + apellido + " C.I:" + cedula + " Matricula:" + matricula + " Marca:" + marcaVehiculo + " Color:" + colorVehiculo + " Tipo:" + tipoDeVehiculo + " Hora de Entrada:" + horaEntrada + " Hora de Salida:" + horaSalida);
    }
    
}

