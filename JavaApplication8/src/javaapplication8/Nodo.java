/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;


public class Nodo {
    
    int valor, altura;
    Nodo izquierda, derecha;

    Nodo(int valor) {
        this.valor = valor;
        this.altura = 1;
    }
}

class ArbolAVL{
    Nodo raiz;

    
    
    
    
    
    
    public int getAlturaArbol (Nodo NodoArbol){
        if((NodoArbol != null)){
            return NodoArbol.altura;
        }
        return 0;
    }
    public int getEquilibro(Nodo NodoArbol){
        if((NodoArbol != null)){
            return getAlturaArbol(NodoArbol.izquierda) - getAlturaArbol(NodoArbol.derecha);
        }
        return 0;
    }
    
    public void nuevaAltura(Nodo NodoArbol){
        if((NodoArbol != null)){
            NodoArbol.altura = Math.max(getAlturaArbol(NodoArbol.derecha), getAlturaArbol(NodoArbol.izquierda)) + 1 ;
        }
    }
    
    public void actualizarAltura(Nodo nodo) {
        if (nodo != null) {
            nodo.altura = Math.max(obtenerAltura(nodo.izquierda), obtenerAltura(nodo.derecha)) + 1;
        }
    }
    
    
    
    private Nodo rotacionHoraria(Nodo y){
        Nodo x = y.izquierda;
        Nodo aux = x.derecha;
        y.izquierda = aux;
        x.derecha = y;
        nuevaAltura(x);
        nuevaAltura(y);
        return x;
    }
    
    private Nodo rotacionAntihoraria(Nodo x){
        Nodo y = x.derecha;
        Nodo aux = y.izquierda;
        y.izquierda = x;
        x.derecha = aux;
        nuevaAltura(x);
        nuevaAltura(y);
        return y;
    }
    
    
    /*public Nodo insertar (Nodo nodo, int valor){
        if (nodo == null){
            return new Nodo(valor);
        }
        //corroboramos si va a la izquierda, derecha o si ya existia
        if (valor<nodo.valor){
            nodo.izquierda = insertar(nodo.izquierda, valor);
        } else if (valor>nodo.valor){
            nodo.derecha = insertar(nodo.derecha, valor);
        }else{
            return nodo;
        }
        nuevaAltura(nodo);
        int Equilibrio = getEquilibro(nodo);
        
        //equilibrar la insercion (lado derecho, debemos pasar los nodos izquierdos, no es un error)
        //sentido horario (momento negativo)
        if (Equilibrio > 1 && valor < nodo.izquierda.valor) {
            return rotacionHoraria(nodo);
        }
        //sentido antihorario (momento positivo)
        if (Equilibrio > 1 && valor > nodo.izquierda.valor) {//
            nodo.izquierda = rotacionAntihoraria(nodo.izquierda);
            return rotacionHoraria(nodo);
        }
        
        //equilibrar la insercion (lado izquierdo, debemos pasar los nodos derechos, no es un error)
        //sentido horario (momento negativo)
        if (Equilibrio < -1 && valor < nodo.derecha.valor) {
            nodo.derecha = rotacionHoraria(nodo.derecha);
            return rotacionAntihoraria(nodo);
        }
        //sentido antihorario (momento positivo)
        if (Equilibrio < -1 && valor > nodo.derecha.valor) {
            return rotacionAntihoraria(nodo);
        }
        return nodo;
    }*/
    public Nodo insertar (Nodo nodo, int valor){
        if (nodo == null){
            return new Nodo(valor);
        }
        //corroboramos si va a la izquierda, derecha o si ya existia
        if (valor<nodo.valor){
            nodo.izquierda = insertar(nodo.izquierda, valor);
        } else if (valor>nodo.valor){
            nodo.derecha = insertar(nodo.derecha, valor);
        }else{
            return nodo;
        }
        nodo=VolteadorYuca_LaVenganzaDelMemoria(nodo, valor);
        return nodo;
    }
    
    
    public Nodo VolteadorYuca_LaVenganzaDelMemoria(Nodo nodo, int puesto){
        nuevaAltura(nodo);
        int Equilibrio = getEquilibro(nodo);
        
        //equilibrar la insercion (lado derecho, debemos pasar los nodos izquierdos, no es un error)
        //sentido horario (momento negativo)
        if (Equilibrio > 1 && puesto < nodo.izquierda.valor) {
            return rotacionHoraria(nodo);
        }
        //sentido antihorario (momento positivo)
        if (Equilibrio > 1 && puesto > nodo.izquierda.valor) {//
            nodo.izquierda = rotacionAntihoraria(nodo.izquierda);
            return rotacionHoraria(nodo);
        }
        
        //equilibrar la insercion (lado izquierdo, debemos pasar los nodos derechos, no es un error)
        //sentido horario (momento negativo)
        if (Equilibrio < -1 && puesto < nodo.derecha.valor) {
            nodo.derecha = rotacionHoraria(nodo.derecha);
            return rotacionAntihoraria(nodo);
        }
        //sentido antihorario (momento positivo)
        if (Equilibrio < -1 && puesto > nodo.derecha.valor) {
            return rotacionAntihoraria(nodo);
        }
        return nodo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Obtener la altura de un nodo
    public int obtenerAltura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }

    // Obtener el factor de equilibrio de un nodo
    public int obtenerFactorEquilibrio(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return obtenerAltura(nodo.izquierda) - obtenerAltura(nodo.derecha);
    }

    // Actualizar la altura de un nodo
    

    // Rotación simple a la derecha
    public Nodo rotacionDerecha(Nodo y) {
        Nodo x = y.izquierda;
        Nodo T2 = x.derecha;

        x.derecha = y;
        y.izquierda = T2;

        // Actualizar alturas
        actualizarAltura(y);
        actualizarAltura(x);

        return x;
    }

    // Rotación simple a la izquierda
    public Nodo rotacionIzquierda(Nodo x) {
        Nodo y = x.derecha;
        Nodo T2 = y.izquierda;

        y.izquierda = x;
        x.derecha = T2;

        // Actualizar alturas
        actualizarAltura(x);
        actualizarAltura(y);

        return y;
    }

    // Insertar un valor en el árbol AVL
    /*public Nodo insertar(Nodo nodo, int valor) {
        // Realizar la inserción normal de un árbol binario de búsqueda
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierda = insertar(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertar(nodo.derecha, valor);
        } else {
            // Duplicados no están permitidos
            return nodo;
        }

        // Actualizar la altura del nodo actual
        actualizarAltura(nodo);

        // Obtener el factor de equilibrio del nodo
        int factorEquilibrio = obtenerFactorEquilibrio(nodo);

        // Realizar rotaciones si es necesario para mantener el equilibrio
        
        // Rotación a la derecha
        if (factorEquilibrio > 1 && valor < nodo.izquierda.valor) {
            return rotacionDerecha(nodo);
        }
        // Rotación a la izquierda
        if (factorEquilibrio < -1 && valor > nodo.derecha.valor) {
            return rotacionIzquierda(nodo);
        }
        // Rotación a la izquierda derecha
        if (factorEquilibrio > 1 && valor > nodo.izquierda.valor) {
            nodo.izquierda = rotacionIzquierda(nodo.izquierda);
            return rotacionDerecha(nodo);
        }
        // Rotación a la derecha izquierda
        if (factorEquilibrio < -1 && valor < nodo.derecha.valor) {
            nodo.derecha = rotacionDerecha(nodo.derecha);
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }*/
    
    // Eliminar un valor del árbol AVL
    public void eliminar(int valor) {
        raiz = eliminar(raiz, valor);
    }

    public Nodo eliminar(Nodo nodo, int valor) {
        // Realizar la eliminación estándar en un árbol binario de búsqueda
        if (nodo == null) {
            return null;
        }

        if (valor < nodo.valor) {
            nodo.izquierda = eliminar(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = eliminar(nodo.derecha, valor);
        } else {
            
            // Nodo con un solo hijo o sin hijos
            if ((nodo.izquierda == null) || (nodo.derecha == null)) {
                
                Nodo temp = null;
                if (temp == nodo.izquierda) {
                    temp = nodo.derecha;
                } else {
                    temp = nodo.izquierda;
                }

                // Caso: Sin hijos
                if (temp == null) {
                    
                    temp = nodo;
                    nodo = null;
                    
                } else { // Caso: Un hijo
                    nodo = temp; // Copiar el contenido del hijo no nulo
                }
            } else {
                // Nodo con dos hijos: obtener el sucesor inorden (menor en el subárbol derecho)
                Nodo temp = obtenerNodoMinimo(nodo.derecha);

                // Copiar los datos del sucesor inorden al nodo actual
                nodo.valor = temp.valor;

                // Eliminar el sucesor inorden
                nodo.derecha = eliminar(nodo.derecha, temp.valor);
            }
        }

        // Si el árbol tenía solo un nodo, entonces retornar
        if (nodo == null) {
            return null;
        }

        // Actualizar la altura del nodo actual
        actualizarAltura(nodo);

        // Obtener el factor de equilibrio del nodo
        int factorEquilibrio = obtenerFactorEquilibrio(nodo);

        // Realizar rotaciones si es necesario para mantener el equilibrio
        // (mismas condiciones que en la inserción)
  
        // Rotación a la derecha
        if (factorEquilibrio > 1 && obtenerFactorEquilibrio(nodo.izquierda) >= 0) {
            return rotacionDerecha(nodo);
        }
        // Rotación a la izquierda
        if (factorEquilibrio < -1 && obtenerFactorEquilibrio(nodo.derecha) <= 0) {
            return rotacionIzquierda(nodo);
        }
        // Rotación a la izquierda derecha
        if (factorEquilibrio > 1 && obtenerFactorEquilibrio(nodo.izquierda) < 0) {
            nodo.izquierda = rotacionIzquierda(nodo.izquierda);
            return rotacionDerecha(nodo);
        }
        // Rotación a la derecha izquierda
        if (factorEquilibrio < -1 && obtenerFactorEquilibrio(nodo.izquierda) > 0) {
            nodo.derecha = rotacionDerecha(nodo.derecha);
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    // Obtener el nodo con el valor mínimo en un subárbol
    public Nodo obtenerNodoMinimo(Nodo nodo) {
        Nodo actual = nodo;

        // Iterar hacia la izquierda para encontrar el nodo más pequeño
        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }

        return actual;
    }

    // Recorrer el árbol en orden
    public void recorrerEnOrdenImp(Nodo nodo, String prefijo) {
        if (nodo != null) {
            recorrerEnOrdenImp(nodo.izquierda,prefijo+" ");
            System.out.println(prefijo+nodo.valor + " ");
            recorrerEnOrdenImp(nodo.derecha,prefijo+" ");
        }
    }
    
    public void recorrerPreordenImp(Nodo nodo,String prefijo) {
        if (nodo != null) {
            
            System.out.println(prefijo+nodo.valor);
            recorrerPreordenImp(nodo.izquierda,(prefijo+" "));
            recorrerPreordenImp(nodo.derecha,(prefijo+" "));
        }
    }
    
    public void recorrerPreorden(Nodo nodo) {
        recorrerPreordenImp(nodo,"");
    }
    
    public void recorrerEnOrden(Nodo nodo){
        recorrerEnOrdenImp(nodo,"-");
    }

}


