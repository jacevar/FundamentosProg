
/**
 * Potenciax. Calcula la potencia de x^n donde n >= 0, para cualquier x.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/21)
 */
import java.util.Scanner;
public class Potenciax
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        
        long x=scan.nextInt();
        long n=scan.nextInt();
        assert(n>=0);
        long pot=1;
        
        
        for(int i=0; i<n; i++){
            pot*=x;

        }
        System.out.println("Potencia de "+ x +" a la " +n+ " es " + pot);
    }
}
