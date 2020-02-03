
/**
 * Write a description of class EjecutarContador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjecutarContador
{
    public static void main(String args[]){
    Contador cont = new Contador();
    cont.Incr();
    cont.Incr();
    cont.Incr();
    cont.Incr();
    cont.Incr();
    System.out.printf("Contador: %03d",cont.obtCont());
    cont.Reiniciar();
    cont.Incr();
    cont.Incr();
    cont.Incr();
    System.out.printf("\nContador: %03d",cont.obtCont());
    cont.Reiniciar();
    System.out.printf("\nContador: %03d",cont.obtCont());
  
      
 
}
}