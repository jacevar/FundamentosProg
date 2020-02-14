
/**
 * Supension si perdio Aprobo si gano y viceversa.
 * 
 * @author (Jacobo Rave L) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Suspencion
{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int nota;

        System.out.print("Ingrese su nota, si aprovó Felicitaciones.\n Si no aprobo pongase a estudiar.\n No se relaje ud es capaz: ");
        nota=scan.nextInt();

        if(nota>=60)
         if (nota<=80)
            System.out.print("Suspendido");

    }
}
