
/**
 * EjecutarContInt.
 * 
 * @author (Jacobo Ravel L) 
 * @version (2020/02/03)
 */
import java.util.*;

public class EjecutarContInt
{
    public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    int c,i;
   
    System.out.print("ingrese valor inicial del contador: ");
    c = scan.nextInt();
    System.out.print("ingrese el incremento del contador: ");
    i = scan.nextInt();
    
    ContIncr contIn = new ContIncr(c,i);
    contIn.incr();
    contIn.incr();
    System.out.printf("valor del contador: %05d", contIn.obtCont());
    contIn.reiniciar();
    contIn.incr();
    contIn.incr();
    contIn.incr();
    System.out.printf("\nvalor del contador: %03d",contIn.obtCont());
    System.out.print("\nNuevo valor del incremento : ");
    i=scan.nextInt();
    contIn.estIncr(i);
    contIn.incr();
    contIn.incr();
    contIn.incr();
    System.out.printf("Valor contador: %04d ",contIn.obtCont());
    
    
    
    
    
    }
}
