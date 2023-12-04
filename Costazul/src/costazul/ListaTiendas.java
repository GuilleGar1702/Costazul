/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

import java.util.Arrays;

/**
 *
 * @author Guillermo
 */
public class ListaTiendas {
    NodoTienda primero;
     private InterfazTienda tienda;
     public ListaTiendas(InterfazTienda tienda)
     {
         this.primero = null;
         this.tienda=tienda;
     }
     public boolean vacio()
     {
         return this.primero == null;
     }
     
    
     public void agregarElemento(String Tienda, String Encargado, String Rubro, String[] Productos)
     {
         NodoTienda nuevoElemento = new NodoTienda(Tienda, Encargado, Rubro, Productos);
         if (this.vacio())
         {
             primero = nuevoElemento;
         }
         else
         {
             NodoTienda actual = primero;
             while (actual.siguiente != null)
             {
                 actual = actual.siguiente;
             }
             actual.siguiente = nuevoElemento;
         }
         
         System.out.println(Tienda);
         System.out.println(Encargado);
         System.out.println(Rubro);
         for (String x:Productos){
             System.out.println(x);
         }
         System.out.println("-----------------------------------------------------------------");
     }
     public void mostrar()
     {
         NodoTienda actual = primero;
         while (actual != null)
         {
             System.out.println(actual.Tienda);
             System.out.println(actual.Encargado);
             System.out.println(actual.Rubro);
             for (String x:actual.Productos){
             System.out.println(x);
         }
             actual = actual.siguiente;
         }
         //System.out.println("Null");
     }
     
     public String buscarElementos(int posicion){
         NodoTienda actual = primero;
         int contador = 0;
         while (actual != null){
             if(contador == posicion){
                 return (actual.Tienda+"\n"+actual.Encargado+"\n"+actual.Rubro+"\n"+Arrays.toString(actual.Productos));
             }
             actual = actual.siguiente;
             contador++;           
         }
        return null;
     }
}
