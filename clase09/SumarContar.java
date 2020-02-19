
/**
 * Write a description of class ContarHastan here.
 * 
 * @author (Jacobo Rave) 
 * @version (2020/02/19)
 */
import java.util.Scanner;
public class SumarContar
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("ingrese el numerro hasta el que quiere contar: ");
        int n,i;
        n=scan.nextInt();

        int suma=0;
        
        for(i=0; i<n; i++){

            System.out.print(i+ "\n" );
            suma += (i+1); 
        }
        System.out.println("suma " + suma);
        
    }
}
