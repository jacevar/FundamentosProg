
/**
 * Write a description of class NOMB3 here.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/01/26)
 */
import java.util.Scanner;

public class CelciusFarenthei
{
    public static void main (String args[]) {
    
    double farenthei, centigrados;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Grados centigrados:");
    centigrados= scan.nextDouble();
    farenthei= (centigrados*9/5)+32;
    
    System.out.printf("Grados centigrados %5.2f°c a grados farenthei %5.2f°f",centigrados,farenthei);
    
    }
    
}