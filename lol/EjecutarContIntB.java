
/**
 * EjecutarContIntB.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/3)
 */
import java.util.Scanner;
public class EjecutarContIntB{

    public static void main(String args[]){
    
     Scanner scan = new Scanner(System.in);   
     int i,c;
     
     ContIncr cont2 = new ContIncr ();
     
     System.out.print("ingrese valor inicial: ");
     c=scan.nextInt();
     System.out.print("ingrese valor de incremento: ");
     i=scan.nextInt();
           
     
     ContIncr cont1 = new ContIncr (c, i);   
     
     cont1.incr();
     cont1.incr();
     cont1.incr();
     
     cont2.incr();
     cont2.incr();
     
     System.out.print("cont1: "+ cont1.obtCont()+" " +"cont2: "+ cont2.obtCont());
     
     cont1.reiniciar();
     
     cont1.incr();
     cont1.incr();
     cont1.incr();
     cont1.incr();
     
     cont2.incr();
     cont2.incr();
     cont2.incr();
     
     System.out.print("\ncont1: "+ cont1.obtCont()+"  " +"cont2: "+ cont2.obtCont());
     
     
     System.out.print("\nnuevo valor incremento cont2: ");
     cont2.reiniciar();
     i=scan.nextInt();
     cont2.estIncr(i);
     
     cont2.incr();
     cont2.incr();
     cont2.incr();
     
     cont1.incr();
     cont1.incr();
     cont1.incr();
        
     System.out.print("cont1: "+ cont1.obtCont()+"  " +"cont2: "+ cont2.obtCont());
    }
}
