
/**
 * Pseudo codigo del ejercicio anterior reducido.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/10)
 */
import java.util.Scanner;
public class Suspencion2
{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int nota;

        System.out.print("Ingrese su nota, si aprovó Felicitaciones.\n Si no aprobo pongase a estudiar.\n No se relaje ud es capaz: ");
        nota=scan.nextInt();

        if(nota>=60&&nota<=80)
         
            System.out.print("Suspendido");

    }
}
