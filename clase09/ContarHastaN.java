
/**
 * Write a description of class ContarHastan here.
 * 
 * @author (Jacobo Rave) 
 * @version (2020/02/19)
 */
import java.util.Scanner;
public class ContarHastaN
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.print("ingrese el numerro hasta el que quiere contar: ");
        int n,i;
        n=scan.nextInt();

        for(i=0; i<n; i++){

            System.out.print(i+ "\n" );

        }
        System.out.println("valor final: " + i);
        
    }
}
