
/**
 * Write a description of class ContarCaracter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ContarCaracter
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String linea1=scan.nextLine();
        String linea2=scan.nextLine();
        int contador=0;
        char c= linea1.charAt(0);
        
        for(int i=0;i<linea2.length();i++){
            
          if(c==linea2.charAt(i)){
         
             contador++;}
        }
        System.out.print(contador);
    }
}