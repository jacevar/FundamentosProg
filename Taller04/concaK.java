
/**
 * Lea una secuencia de datos en temperatura en grados Grados Celsius y la transforme en Kelvin
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/20)
 */
import java.util.Scanner;
public class concaK
{
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        double tc, tk;
        System.out.println("Ingrese valor Celcius");
        tc=0;
        tk=0;
        while(scan.hasNextDouble())
        {
            tc=scan.nextDouble();
            tk=tc+273.15;
            if(tk<=0||tk>=329.15){

            }
            else if(tk>0&&tk<329.15){
                System.out.println("C: "+ tc + " -"+">"+ " K: "+ tk );
            }

        }
    }
}
