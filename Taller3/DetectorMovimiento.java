
/**
 * Robot que retrocede y avanza.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/10)
 */
import java.util.Scanner;
public class DetectorMovimiento
{
    public static void main(String args[]){

        int Diferencia;
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribir la diferencia del movimiento de robot: ");

        Diferencia=scan.nextInt();

        if(Diferencia>0) {
            System.out.print("Avanza");
        }
        else
        {
            if(Diferencia<0){
                System.out.print("Retrocede");
            }

            else{
                System.out.print("Detenido");
            }
        }

    }
}
