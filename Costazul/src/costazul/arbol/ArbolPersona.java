package costazul.arbol;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 
@author regna*/
public class ArbolPersona {

    public NodoPersona raiz;

    public int getAlturaArbol (NodoPersona NodoPersona){
        if((NodoPersona != null)){
            return NodoPersona.altura;
        }
        return 0;
    }
    public int getEquilibrio(NodoPersona NodoPersona){
        if((NodoPersona != null)){
            return getAlturaArbol(NodoPersona.izquierda) - getAlturaArbol(NodoPersona.derecha);
        }
        return 0;
    }
    
    public void nuevaAltura(NodoPersona NodoPersona){
        if((NodoPersona != null)){
            NodoPersona.altura = Math.max(getAlturaArbol(NodoPersona.derecha), getAlturaArbol(NodoPersona.izquierda)) + 1 ;
        }
    }
    
    private NodoPersona rotacionHoraria(NodoPersona y){
        NodoPersona x = y.izquierda;
        NodoPersona aux = x.derecha;
        y.izquierda = aux;
        x.derecha = y;
        nuevaAltura(x);
        nuevaAltura(y);
        return x;
    }
    
    private NodoPersona rotacionAntihoraria(NodoPersona x){
        NodoPersona y = x.derecha;
        NodoPersona aux = y.izquierda;
        y.izquierda = x;
        x.derecha = aux;
        nuevaAltura(x);
        nuevaAltura(y);
        return y;
    }
    
    //Mosca Cesar, que si raspo esta vaina dejo de estudiar
    //Y me vuelvo un loquito del centro
    public NodoPersona VolteadorYuca_LaVenganzaDelMemoria(NodoPersona nodo, int cedula){
        nuevaAltura(nodo);
        int Equilibrio = getEquilibrio(nodo);
        
        //equilibrar la insercion (lado derecho, debemos pasar los nodos izquierdos, no es un error)
        //sentido horario (momento negativo)
        if (Equilibrio > 1 && cedula < nodo.izquierda.cedula) {
            return rotacionHoraria(nodo);
        }
        //sentido antihorario (momento positivo)
        if (Equilibrio > 1 && cedula > nodo.izquierda.cedula) {//
            nodo.izquierda = rotacionAntihoraria(nodo.izquierda);
            return rotacionHoraria(nodo);
        }
        
        //equilibrar la insercion (lado izquierdo, debemos pasar los nodos derechos, no es un error)
        //sentido horario (momento negativo)
        if (Equilibrio < -1 && cedula < nodo.derecha.cedula) {
            nodo.derecha = rotacionHoraria(nodo.derecha);
            return rotacionAntihoraria(nodo);
        }
        //sentido antihorario (momento positivo)
        if (Equilibrio < -1 && cedula > nodo.derecha.cedula) {
            return rotacionAntihoraria(nodo);
        }
        return nodo;
    }
    
    public NodoPersona insertar (NodoPersona nodo, String nombre, String apellido, int cedula){
        if (nodo == null){
            return new NodoPersona(nombre, apellido, cedula);
        }
        //corroboramos si va a la izquierda, derecha o si ya existia
        if (cedula<nodo.cedula){
            nodo.izquierda = insertar(nodo.izquierda, nombre, apellido, cedula);
        } else if (cedula>nodo.cedula){
            nodo.derecha = insertar(nodo.derecha, nombre, apellido, cedula);
        }else{
            return nodo;
        }
        nodo=VolteadorYuca_LaVenganzaDelMemoria(nodo, cedula);
        return nodo;
    }
    
    
    public NodoPersona obtenerNodoMinimo(NodoPersona nodo) {
        NodoPersona actual = nodo;

        
        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }

        return actual;
    }
    
    //eliminar elementos del arbol
    public void borrar(int cedula) {
        raiz = eliminar(raiz, cedula);
        
    }
    public NodoPersona eliminar (NodoPersona nodo, int cedula){
        if (nodo==null){
            return null; //en caso de que el nodo sea nulo entonces cortamos de una el metodo
        }
        if (cedula < nodo.cedula){
            nodo.izquierda = eliminar (nodo.izquierda, cedula);
        } else if (cedula > nodo.cedula){
            nodo.derecha = eliminar(nodo.derecha, cedula);
        } else {
            //corroboramos si tenemos hojas o no
            if ((nodo.izquierda == null) || (nodo.derecha == null)) {
                
                NodoPersona aux = null;
                if (aux == nodo.izquierda) {
                    aux = nodo.derecha;
                } else {
                    aux = nodo.izquierda;
                }

                // caso preservativo (sin hijos)
                if (aux == null) {
                    
                    aux = nodo;
                    nodo = null;
                    
                } else { // caso Guillermo (un hijo)
                    nodo = aux; //copiamos la hoja
                }
            }else {
                // caso Alfredo (dos hijos) obtener el sucesor inorden (menor en el subárbol derecho)
                NodoPersona aux = obtenerNodoMinimo(nodo.derecha);

                // Copiar los datos del sucesor inorden al nodo actual
                nodo.nombre = aux.nombre;
                nodo.apellido = aux.apellido;
                nodo.cedula = aux.cedula;
                // Abortamos al carajito
                nodo.derecha = eliminar(nodo.derecha, aux.cedula);//////////////////////////////////////////////////////
            }
        }
        // Si el árbol tenía solo un nodo, entonces retornar
        if (nodo == null) {
            return null;
        }
        nodo=VolteadorYuca_LaVenganzaDelMemoria(nodo, cedula);
        return nodo;
    }
    // Recorrer el árbol en orden
    public void recorrerEnOrden(NodoPersona nodo, String prefijo) {
        if (nodo != null) {
            recorrerEnOrden(nodo.izquierda,prefijo+" ");
            System.out.println(prefijo+nodo.cedula + " ");
            recorrerEnOrden(nodo.derecha,prefijo+" ");
        }
    }
    
    public void recorrerPreorden(NodoPersona nodo,String prefijo) {
        if (nodo != null) {
            
            System.out.println(prefijo+nodo.cedula+"||\n"+nodo.nombre+"\n"+nodo.apellido+"||");
            recorrerPreorden(nodo.izquierda,(prefijo+" "));
            recorrerPreorden(nodo.derecha,(prefijo+" "));
        }
    }
    
    public void iniciarPreorden(NodoPersona nodo) {
        recorrerPreorden(nodo,"");
    }
    
    public void iniciarEnOrden(NodoPersona nodo){
        recorrerEnOrden(nodo,"-");
    }
    
    public void Registro(NodoPersona nodo){
        if (nodo != null) {
            try {
                Registro(nodo.izquierda);
                //System.out.println(nodo.cedula);
                String registro= nodo.cedula+"-"+nodo.nombre+"-"+nodo.apellido+"\n";
                Files.write(Paths.get("./src/costazul/arbol/Personas.txt"), registro.getBytes(), StandardOpenOption.APPEND);
                Registro(nodo.derecha);
            } catch (IOException ex) {
                Logger.getLogger(ArbolPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
    
}
