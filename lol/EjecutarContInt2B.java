
/**
 * Write a description of class EjecutarContIncr2B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EjecutarContInt2B{

    public static void main(String args[]){
    
     Scanner scan = new Scanner(System.in);   
     int i,c;
     
     ContIncr2 cont2 = new ContIncr2 ();
     
     System.out.print("ingrese valor inicial: ");
     c=scan.nextInt();
     System.out.print("ingrese valor de incremento: ");
     i=scan.nextInt();
           
     
     ContIncr2 cont1 = new ContIncr2 (c, i);   
     
     cont1.incr();
     cont1.incr();
     cont1.incr();
     
     cont2.incr();
     cont2.incr();
     
     System.out.print("cont1: "+ cont1.obtCont()+"  " +"cont2: "+ cont2.obtCont()+ " " + "Fin");
     
     cont1.reiniciar();
     
     cont1.incr();
     cont1.incr();
     cont1.incr();
     cont1.incr();
     
     cont2.incr();
     cont2.incr();
     cont2.incr();
     
     System.out.print("\ncont1: "+ cont1.obtCont()+"  " +"cont2: "+ cont2.obtCont()+ " " + "Fin");
     
     
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
        
     System.out.print("cont1: "+ cont1.obtCont()+"  " +"cont2: "+ cont2.obtCont()+" " + "Fin");
    }
}
