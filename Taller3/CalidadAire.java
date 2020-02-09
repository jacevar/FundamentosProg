
/**
 * Si el aire es el permitido "Normal" sino "Emergencia".
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/08)
 */
import java.util.Scanner;
public class CalidadAire
{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        final float permitido = 25.05f;
        float valorActual;

        System.out.println("Ingrese el valor actual de las particulas PM2.5:");
        valorActual= scan.nextFloat();

        if(valorActual>permitido)
            System.out.print("Emergencia");
        else
            System.out.print("Normal");
    }
}
