
/**
 * EjecutarContIncr2.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/4)
 */
import java.util.Scanner;
public class EjecutarContIncr2
{
   public static void main(String args[]){
    
   Scanner scan= new Scanner(System.in);
   int c,i;   
   
      
   System.out.print("valor inicial: ");
   c=scan.nextInt();
   System.out.print("valor incremento: ");
   i=scan.nextInt();
   
   ContIncr2 contt= new ContIncr2(c,i);
   
   contt.incr();
   contt.incr();
   
   System.out.printf("Valor contador: %05d", contt.obtCont());
   
   contt.reiniciar();
   
   contt.incr();
   contt.incr();
   contt.incr();
   
   System.out.print("\nValor contador:" + contt.obtCont());
   
   
   System.out.print("\nNuevo valor incremento: ");
   i=scan.nextInt();
   contt.estIncr(i);
   
   contt.incr();
   contt.incr();
   contt.incr();
   
   System.out.printf("Valor contador: %04d", contt.obtCont());
   
    } 
    
}
