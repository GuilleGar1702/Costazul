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
     public void agregarElemento(int cedula, String nombre, String apellido, String marca, String matricula, String color, String vehiculo, String seccion)
     {
         NodoLista nuevoElemento = new NodoLista(cedula, nombre, apellido, marca, matricula, color, vehiculo, seccion);
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
             System.out.println(actual.Cedula);
             System.out.println(actual.Nombre);
             System.out.println(actual.Apellido);
             System.out.println(actual.Marca);
             System.out.println(actual.Matricula);
             System.out.println(actual.Color);
             System.out.println(actual.Vehiculo);
             System.out.println(actual.Seccion);
             actual = actual.siguiente;
         }
         //System.out.println("Null");
     }
     
     public String buscarElementos(int posicion){
         NodoLista actual = primero;
         int contador = 0;
         while (actual != null){
             if(contador == posicion){
                 return (String.valueOf(actual.Cedula)+"\n"+actual.Nombre+" "+actual.Apellido+"\n"+actual.Marca+"\n"+actual.Matricula+"\n"+actual.Color+"\n"+actual.Vehiculo);
             }
             actual = actual.siguiente;
             contador++;           
         }
        return null;
         
     }
}
