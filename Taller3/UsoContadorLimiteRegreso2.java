
/**
 * Contador aplicado.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/13)
 */
import java.util.Scanner;
public class UsoContadorLimiteRegreso2
{
    public static void main(String args[]){

        int lim, incr, valorActual;

        Scanner scan=new Scanner(System.in);

        lim=4;

        ContadorLimiteRegreso limit = new ContadorLimiteRegreso(lim);

        System.out.println(limit.obtActual());
        System.out.println(limit.obtActual());
        System.out.println(limit.obtActual());
        System.out.println(limit.obtActual());
        System.out.println(limit.obtActual());
        System.out.println(limit.obtActual());
        System.out.println(limit.obtActual());
        System.out.println(limit.obtActual());
        System.out.println(limit.obtActual());
        System.out.println(limit.obtActual());
    }
}