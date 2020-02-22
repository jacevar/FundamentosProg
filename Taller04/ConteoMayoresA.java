
/**
 * contar la cantidad de numeros mayores al limite.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/19)
 */
import java.util.Scanner;
public class ConteoMayoresA
{
    public static void main(String [] args){

        Scanner scan= new Scanner(System.in);
        int limite, valor,acumulador=0;
        System.out.print("Ingrese limite");
        limite=scan.nextInt();
        System.out.print("Ingrese valores");
        valor=scan.nextInt();

        while(valor>0){

            if(valor>limite){

                acumulador++;}
                valor=scan.nextInt();
            

        }
        System.out.print("Salida: " + acumulador);
    }
}
