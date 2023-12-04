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
public class ArbolEstacionamiento {

    public NodoArbol raiz;

    public int getAlturaArbol (NodoArbol NodoArbol){
        if((NodoArbol != null)){
            return NodoArbol.altura;
        }
        return 0;
    }
    public int getEquilibrio(NodoArbol NodoArbol){
        if((NodoArbol != null)){
            return getAlturaArbol(NodoArbol.izquierda) - getAlturaArbol(NodoArbol.derecha);
        }
        return 0;
    }
    
    public void nuevaAltura(NodoArbol NodoArbol){
        if((NodoArbol != null)){
            NodoArbol.altura = Math.max(getAlturaArbol(NodoArbol.derecha), getAlturaArbol(NodoArbol.izquierda)) + 1 ;
        }
    }
    
    private NodoArbol rotacionHoraria(NodoArbol y){
        NodoArbol x = y.izquierda;
        NodoArbol aux = x.derecha;
        y.izquierda = aux;
        x.derecha = y;
        nuevaAltura(x);
        nuevaAltura(y);
        return x;
    }
    
    private NodoArbol rotacionAntihoraria(NodoArbol x){
        NodoArbol y = x.derecha;
        NodoArbol aux = y.izquierda;
        y.izquierda = x;
        x.derecha = aux;
        nuevaAltura(x);
        nuevaAltura(y);
        return y;
    }
    
    //Mosca Cesar, que si raspo esta vaina dejo de estudiar
    //Y me vuelvo un loquito del centro
    public NodoArbol VolteadorYuca_LaVenganzaDelMemoria(NodoArbol nodo, int puesto){
        nuevaAltura(nodo);
        int Equilibrio = getEquilibrio(nodo);
        
        //equilibrar la insercion (lado derecho, debemos pasar los nodos izquierdos, no es un error)
        //sentido horario (momento negativo)
        if (Equilibrio > 1 && puesto < nodo.izquierda.puesto) {
            return rotacionHoraria(nodo);
        }
        //sentido antihorario (momento positivo)
        if (Equilibrio > 1 && puesto > nodo.izquierda.puesto) {//
            nodo.izquierda = rotacionAntihoraria(nodo.izquierda);
            return rotacionHoraria(nodo);
        }
        
        //equilibrar la insercion (lado izquierdo, debemos pasar los nodos derechos, no es un error)
        //sentido horario (momento negativo)
        if (Equilibrio < -1 && puesto < nodo.derecha.puesto) {
            nodo.derecha = rotacionHoraria(nodo.derecha);
            return rotacionAntihoraria(nodo);
        }
        //sentido antihorario (momento positivo)
        if (Equilibrio < -1 && puesto > nodo.derecha.puesto) {
            return rotacionAntihoraria(nodo);
        }
        return nodo;
    }
    
    public NodoArbol insertar (NodoArbol nodo, String nombre, String apellido, String cedula, String matricula, String tipoDeVehiculo, String marcaVehiculo, String colorVehiculo, String horaEntrada, String horaSalida, char seccion, int puesto){
        if (nodo == null){
            return new NodoArbol(nombre, apellido, cedula, matricula, tipoDeVehiculo, marcaVehiculo, colorVehiculo, horaEntrada, horaSalida, seccion, puesto);
        }
        //corroboramos si va a la izquierda, derecha o si ya existia
        if (puesto<nodo.puesto){
            nodo.izquierda = insertar(nodo.izquierda, nombre, apellido, cedula, matricula, tipoDeVehiculo, marcaVehiculo, colorVehiculo, horaEntrada, horaSalida, seccion, puesto);
        } else if (puesto>nodo.puesto){
            nodo.derecha = insertar(nodo.derecha, nombre, apellido, cedula, matricula, tipoDeVehiculo, marcaVehiculo, colorVehiculo, horaEntrada, horaSalida, seccion, puesto);
        }else{
            return nodo;
        }
        nodo=VolteadorYuca_LaVenganzaDelMemoria(nodo, puesto);
        return nodo;
    }
    
    
    public NodoArbol obtenerNodoMinimo(NodoArbol nodo) {
        NodoArbol actual = nodo;

        
        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }

        return actual;
    }
    
    //eliminar elementos del arbol
    public void borrar(int puesto) {
        raiz = eliminar(raiz, puesto);
        
    }
    public NodoArbol eliminar (NodoArbol nodo, int puesto){
        if (nodo==null){
            return null; //en caso de que el nodo sea nulo entonces cortamos de una el metodo
        }
        if (puesto < nodo.puesto){
            nodo.izquierda = eliminar (nodo.izquierda, puesto);
        } else if (puesto > nodo.puesto){
            nodo.derecha = eliminar(nodo.derecha, puesto);
        } else {
            //corroboramos si tenemos hojas o no
            if ((nodo.izquierda == null) || (nodo.derecha == null)) {
                
                NodoArbol aux = null;
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
                NodoArbol aux = obtenerNodoMinimo(nodo.derecha);

                // Copiar los datos del sucesor inorden al nodo actual
                nodo.puesto = aux.puesto;
                nodo.nombre = aux.nombre;
                nodo.apellido = aux.apellido;
                nodo.cedula = aux.cedula;
                nodo.tipoDeVehiculo = aux.tipoDeVehiculo;
                nodo.colorVehiculo = aux.colorVehiculo;
                nodo.matricula = aux.matricula;
                nodo.marcaVehiculo = aux.marcaVehiculo;
                nodo.seccion = aux.seccion;
                nodo.horaEntrada = aux.horaEntrada;
                nodo.horaSalida = aux.horaSalida;
                // Abortamos al carajito
                nodo.derecha = eliminar(nodo.derecha, aux.puesto);//////////////////////////////////////////////////////
            }
        }
        // Si el árbol tenía solo un nodo, entonces retornar
        if (nodo == null) {
            return null;
        }
        nodo=VolteadorYuca_LaVenganzaDelMemoria(nodo, puesto);
        return nodo;
    }
    // Recorrer el árbol en orden
    public void recorrerEnOrden(NodoArbol nodo, String prefijo) {
        if (nodo != null) {
            recorrerEnOrden(nodo.izquierda,prefijo+" ");
            System.out.println(prefijo+nodo.puesto + " ");
            recorrerEnOrden(nodo.derecha,prefijo+" ");
        }
    }
    
    public void recorrerPreorden(NodoArbol nodo,String prefijo) {
        if (nodo != null) {
            
            System.out.println(prefijo+nodo.puesto+"||\n"+nodo.nombre+"\n"+nodo.apellido+"\n"+nodo.cedula+"\n"+nodo.colorVehiculo+"\n"+nodo.marcaVehiculo+"\n"+nodo.matricula+"\n"+nodo.horaEntrada+"\n"+nodo.horaSalida+"||");
            recorrerPreorden(nodo.izquierda,(prefijo+" "));
            recorrerPreorden(nodo.derecha,(prefijo+" "));
        }
    }
    
    public void iniciarPreorden(NodoArbol nodo) {
        recorrerPreorden(nodo,"");
    }
    
    public void iniciarEnOrden(NodoArbol nodo){
        recorrerEnOrden(nodo,"-");
    }
    
    public void Registro(NodoArbol nodo){
        if (nodo != null) {
            try {
                Registro(nodo.izquierda);
                //System.out.println(nodo.puesto);
                String registro= nodo.puesto+"-"+nodo.seccion+"-"+nodo.nombre+"-"+nodo.apellido+"-"+nodo.cedula+"-"+nodo.colorVehiculo+"-"+nodo.marcaVehiculo+"-"+nodo.matricula+"-"+nodo.horaEntrada+"-"+nodo.horaSalida+"-"+nodo.tipoDeVehiculo+"\n";
                Files.write(Paths.get("./src/costazul/arbol/Parking.txt"), registro.getBytes(), StandardOpenOption.APPEND);
                Registro(nodo.derecha);
            } catch (IOException ex) {
                Logger.getLogger(ArbolEstacionamiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    //guille te deje el discord un video con el funcionamiento, pero aqui te comento, mira si el int de puesto que quiere sbuscar esta en el nodo raiz
    //si es menor busca a la izquierda, si es mayor busca a la derecha y si lo consigue imprime con un metodo imprimir que esta en la clase nodo, eso es solo para tenerlo en logs
    //el devuelve el nodoencontrado, sino lo encuentra devuelve null
    public NodoArbol buscarPuesto(NodoArbol nodo, int buscarPuesto){
        if(nodo != null){
            if (nodo.puesto == buscarPuesto){
                nodo.imprimirNodo();
                return nodo;
            }
            if (buscarPuesto < nodo.puesto){
                return buscarPuesto(nodo.izquierda, buscarPuesto);
            }else{
                return buscarPuesto(nodo.derecha, buscarPuesto);
            }
        }
        return null;
    }
    
    
    
    
    
}
