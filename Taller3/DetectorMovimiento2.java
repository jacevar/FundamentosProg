
/**
 * Write a description of class DetectorMovimiento2 here.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/10)
 */
import java.util.Scanner;
public class DetectorMovimiento2
{
    public static void main(String args[]){

        int Diferencia;
        Scanner scan = new Scanner(System.in);
        System.out.print("Escribir la diferencia del movimiento de robot: ");

        Diferencia=scan.nextInt();

        if(Diferencia>=0) {
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
