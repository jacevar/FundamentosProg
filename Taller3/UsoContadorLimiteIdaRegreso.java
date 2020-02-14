
/**
 * UsoContadorLimiteIdaRegreso.
 * 
 * @author (acobo Rave Londoñ) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class UsoContadorLimiteIdaRegreso
{

    public static void main(String args[]){

        int valorActual,LimiteInf,LimiteSup, incr;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba dos números separados por espacios: ");

        LimiteInf=scan.nextInt();
        LimiteSup=scan.nextInt();
        

        ContadorLimiteIdaRegreso conttt = new ContadorLimiteIdaRegreso(LimiteInf, LimiteSup);
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
        System.out.println(conttt.obtActual());
    }
}
