
/**
 * EjecutarContadorB.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/03)
 */
public class EjecutarContadorB
{
  public static void main(String args[]){
     Contador cont1 = new Contador();
   
   Contador cont2 = new Contador();
   
    cont1.Incr();
    cont1.Incr();
    cont1.Incr();
   cont2.Incr();
   cont2.Incr();
   
    System.out.print("Cont1: "+cont1.obtCont());
    System.out.printf("   Cont2: %02d",cont2.obtCont());
    cont1.Reiniciar();
    cont1.Incr();
    cont1.Incr();
    cont1.Incr();
    cont2.Incr();
    cont2.Incr();
    
   System.out.print("\nCont1: "+cont1.obtCont());
    System.out.printf("   Cont2: %02d",cont2.obtCont());
    cont1.Reiniciar();
    cont2.Reiniciar();
    cont1.Incr();
    cont1.Incr();
    cont1.Incr();
    cont1.Incr();
    cont2.Incr();
    cont2.Incr();
     System.out.print("\nCont1: "+cont1.obtCont());
    System.out.printf("   Cont2: %02d",cont2.obtCont());
  
   
}
   }