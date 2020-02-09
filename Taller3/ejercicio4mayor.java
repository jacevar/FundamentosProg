
/**
 * Write a description of class ejercicio4mayor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ejercicio4mayor
{
    public static void main(String [] args){

        Scanner scan= new Scanner(System.in);
        int v1,v2;

        System.out.print("Ingrese valor 1: ");
        v1= scan.nextInt();
        System.out.print("Ingrese valor 2: ");
        v2= scan.nextInt();
        boolean cond=v1<v2;

        if(cond)
            System.out.print("Mayor");    
    }
}
