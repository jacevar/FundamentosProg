
/**
 * Write a description of class CopyOfContarCaracter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CopyOfContarCaracter
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        
        String linea1=scan.nextLine();
        String linea2=scan.nextLine();
        char c= linea1.charAt(0);
        int contador=0;
        int posIni=0,siguiente;
        //String c=linea1.indexOf('a');
        siguiente=linea2.indexOf(c,posIni);

        while(siguiente!=-1){
            contador++;
            posIni= siguiente+1;
            siguiente=linea2.indexOf(c, posIni);
        }

        System.out.print(contador);
    }
      
}

