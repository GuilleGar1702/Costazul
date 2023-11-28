/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costazul;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Guillermo
 */
public class Tiendas {
    ListaTiendas listaTiendas= new ListaTiendas();
    public void cargarTiendas() 
        throws IOException{
        Path ruta= Paths.get("F:\\Users\\Guillermo\\Documents\\Universidad\\Estructura de Datos\\Proyectos\\Costaazul\\Costazul\\Costazul\\src\\costazul\\Tiendas.txt");
        List<String> listaPajuaTiendas=Files.readAllLines(ruta);
        String[] xd= new String[listaPajuaTiendas.size()];
        listaPajuaTiendas.toArray(xd);
        for (String x:xd){
            System.out.println(x);
        }
    }
    
}
