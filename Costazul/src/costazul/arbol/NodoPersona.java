
package costazul.arbol;

/**
 *
 * @author Guillermo
 */
public class NodoPersona {
    String nombre;
    String apellido;
    public int cedula;
    int altura;

    NodoPersona izquierda, derecha;

    public NodoPersona(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.altura = 1;
    }
}

