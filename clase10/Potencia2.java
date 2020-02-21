
/**
 * Potencia2. Calcula la potencia de 2^n donde n >= 0.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/21)
 */
import java.util.Scanner;
public class Potencia2
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        assert(n>=0);
        int pot=1;
        final int DOS=2;
        
        for(int i=0; i<n; i++){
            pot*=DOS;//pot=pot*2  pot*=2

        }
        System.out.println("Potencia de 2 a la " +n+ " es " + pot);
    }
}
