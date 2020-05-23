
/**
 * Write a description of class utilidadesArchivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
//import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;
public class UtilidadesArchivo
{
    
    public static List<String> leerArchivo(String rutaArchivo){
        List<String> listLineas = new ArrayList();
        
        try{
        Scanner scan=new Scanner (new File(rutaArchivo/*"C:/Users/jac/Desktop/nq20200429-09-10.txt"*/));
        while(scan.hasNextLine()){
        //System.out.println(scan.nextLine());
        listLineas.add(scan.nextLine());
        }
        
        
        }
        catch(Exception e){
        e.getMessage()/*printStackTrace()*/;
        }
        return listLineas;
    }
    
    
}
