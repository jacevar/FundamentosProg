
/**
 * Impuesto si sube o baja.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/8)
 */
import java.util.Scanner;
public class Impuestos2
{public static void main(String[]args){
        int i;
        Scanner scan=new Scanner(System.in);
        System.out.print("Porfavor ingrese su salario: ");
        i=scan.nextInt();

        if(i>=90000000){
            float im;
            im= (i*1.1f)/100;
            System.out.print( "Su impuesto es de: "+im);
        }
        else{
            float im;
            im= (i*0.9f)/100;
            System.out.print( "Su impuesto es de: "+im);
        }
    }
}
