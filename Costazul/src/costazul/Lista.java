package costazul;

public class Lista {
    NodoLista primero;
     
     public Lista()
     {
         this.primero = null;
     }
     public boolean vacio()
     {
         return this.primero == null;
     }
     public void agregarElemento(String nombre)
     {
         NodoLista nuevoElemento = new NodoLista(nombre);
         if (this.vacio())
         {
             primero = nuevoElemento;
         }
         else
         {
             NodoLista actual = primero;
             while (actual.siguiente != null)
             {
                 actual = actual.siguiente;
             }
             actual.siguiente = nuevoElemento;
         }
     }
     public void mostrar()
     {
         NodoLista actual = primero;
         while (actual != null)
         {
             System.out.println(actual.Nombre);
             actual = actual.siguiente;
         }
         //System.out.println("Null");
     }
     
     public String buscarElementos(int posicion){
         NodoLista actual = primero;
         int contador = 0;
         while (actual != null){
             if(contador == posicion){
                 return actual.Nombre;
             }
             actual = actual.siguiente;
             contador++;           
         }
        return null;
         
     }
}
