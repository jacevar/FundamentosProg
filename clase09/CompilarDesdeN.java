
/**
 * Write a description of class CompilarDesdeN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CompilarDesdeN
{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int i,n;
    System.out.print("Valor de decremento");
    n=scan.nextInt();
    
    for(i=0;i<n;i++){
    
    System.out.print(n-i);
    }
}
}
