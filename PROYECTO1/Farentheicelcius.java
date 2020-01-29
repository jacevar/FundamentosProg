
/**
 * Write a description of class FarentheiCelcius here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Farentheicelcius
{
    public static void main (String args[]) {
    
    double farenthei, centigrados;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Grados farenthei:");
    farenthei= scan.nextDouble();
    centigrados= (farenthei-32)*5/9;
    
    System.out.printf("Grados farenthei %5.2f°f a grados centigrados %5.2f°c",farenthei,centigrados);
    
    }
    
}