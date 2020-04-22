
/**
 * Write a description of class IV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IV
{
    public static String inverso(String cadena) {

       if(cadena.length() == 0 || cadena.length() == 1)
       return cadena;
       return cadena.substring(cadena.length()-1)+
              inverso(cadena.substring(0, cadena.length()));
        
        
    }  
}
