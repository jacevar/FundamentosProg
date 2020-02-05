
/**
 * Marca muestra la menor vuelta, el promedio, el mayor.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/05)
 */
import java.util.*;
public class Marca
{
   public static void main(String []args)
   {
    Scanner scan =new Scanner(System.in);
    
    float vuelta1, vuelta2, prom;
    
    System.out.print("Entrada vuelta1 y vuelta2"); 
    vuelta1= scan.nextFloat();
    vuelta2= scan.nextFloat();
    
    prom= (vuelta1+vuelta2) / 2.0f;
    
    float menor, mayor;
    
    if(vuelta1>vuelta2){
        menor=vuelta2;
        mayor=vuelta1;
   }
   else{
       menor=vuelta1;
       mayor=vuelta2;
    
    }
   
   System.out.println("menor: " + menor+ "prom :" + prom+"mayor: "+mayor);
}
}