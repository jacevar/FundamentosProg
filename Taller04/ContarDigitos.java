
/**
 * invertir Digitos de un numero y decir cuantos son.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/22)
 */
import java.util.Scanner;
public class ContarDigitos
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int division, num=0,acumulador=0;
        num=scan.nextInt();

        do{division=num % 10 ;

            num= num/10;
            acumulador++;
            System.out.println(division);
            
        }
        while(num>0);
           System.out.print("num digitos "+acumulador);
    }
}
