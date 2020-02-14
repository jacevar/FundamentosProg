
/**
 * ValorAbsoluto.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/10)
 */
import java.util.Scanner;
public class ValorAbsoluto
{
    public static void main(String[]args){

        int n;
        Scanner scan=new Scanner(System.in);

        System.out.print("Ingrese cualquier número y saldra su valor absoluto: ");
        n=scan.nextInt();

        if(n>=0)
        {
            System.out.print(n);

        }
        else{

            System.out.print(n*-1);
        }

    }
}
