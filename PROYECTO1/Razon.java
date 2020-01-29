
/**
 * Write a description of class NOMBRE5 here.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/01/26)
 */
import java.util.Scanner;
public class Razon
{
  public static void main (String args[]) {
  
  double r,h,s;
  Scanner scan = new Scanner(System.in);
     
      
      System.out.print("Ingrese r y h:");
      
      r = scan.nextDouble();
      h = scan.nextDouble();
      s = (Math.PI*r)*((Math.sqrt((r*r)+(h*h))));
     
      System.out.printf("El valor es"+s);
      
    }
}

