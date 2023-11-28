/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

/**
 *
 * @author Guillermo
 */
public class ListaTiendas {
    NodoTienda primero;
     
     public ListaTiendas()
     {
         this.primero = null;
     }
     public boolean vacio()
     {
         return this.primero == null;
     }
     public void agregarElemento(String Tienda, String Encargado, String Rubro)
     {
         NodoTienda nuevoElemento = new NodoTienda(Tienda, Encargado, Rubro);
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
             actual = actual.siguiente;
         }
         //System.out.println("Null");
     }
     
     public String buscarElementos(int posicion){
         NodoTienda actual = primero;
         int contador = 0;
         while (actual != null){
             if(contador == posicion){
                 return (actual.Tienda+" "+actual.Encargado+"\n"+actual.Rubro);
             }
             actual = actual.siguiente;
             contador++;           
         }
        return null;
         
     }
}
