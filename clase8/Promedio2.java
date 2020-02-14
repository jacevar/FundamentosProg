
/**
 * Calacular el promedio de una secuencia de valores.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/14)
 */
import java.util.Scanner;
public class Promedio2
{
    public static void main (String args[]){

        int suma, n, num;
        float prom=0.0f;
        Scanner scan=new Scanner(System.in);

        suma=n=num=0;
        num=scan.nextInt();

        while(scan.hasNextInt()){

            //suma=suma+num;
            //n=n+1;  
            suma += num;
            n++;
            
        }

        if(n>0){
            prom=((float)suma)/n;
        }
            
       System.out.println(prom);     
    }
}
