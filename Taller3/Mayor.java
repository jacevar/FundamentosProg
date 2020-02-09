
/**
 * Imprimir mayor si 2 mayor que 1.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/8)
 */
import java.util.Scanner;
public class Mayor
{
    public static void main(String [] args){

        Scanner scan= new Scanner(System.in);
        int v1,v2;

        System.out.print("Ingrese valor 1: ");
        v1= scan.nextInt();
        System.out.print("Ingrese valor 2: ");
        v2= scan.nextInt();

        if(v1<v2)
            System.out.print("Mayor");    
    }
}
