/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
public class avl {

    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();

        // Insertar elementos en el árbol AVL
        
        arbol.raiz = arbol.insertar(arbol.raiz, 10);
        arbol.raiz = arbol.insertar(arbol.raiz, 20);
        arbol.raiz = arbol.insertar(arbol.raiz, 30);
        arbol.raiz = arbol.insertar(arbol.raiz, 40);
        arbol.raiz = arbol.insertar(arbol.raiz, 50);
        arbol.raiz = arbol.insertar(arbol.raiz, 60);
        arbol.raiz = arbol.insertar(arbol.raiz, 70);
  //      arbol.raiz = arbol.insertar(arbol.raiz, 45);
//        arbol.raiz = arbol.insertar(arbol.raiz, 45);
//        arbol.raiz = arbol.insertar(arbol.raiz, 25);

        System.out.println("Imprimir el árbol en orden");
        arbol.recorrerPreorden(arbol.raiz);
        
        arbol.eliminar(10);
        
        System.out.println("Imprimir el árbol en orden");
        arbol.recorrerPreorden(arbol.raiz);
        
        
        /*System.out.println("altura");
        System.out.println(arbol.obtenerAltura(arbol.raiz.derecha));
        //System.out.println(arbol.getAlturaArbol(arbol.raiz.derecha));*/
        /*System.out.println("equilibrio");
        //System.out.println(arbol.obtenerFactorEquilibrio(arbol.raiz));
        System.out.println(arbol.getEquilibro(arbol.raiz));*/
        System.out.println("");
        
    }
}
