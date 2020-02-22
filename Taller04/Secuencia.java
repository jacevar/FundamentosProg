/**
 * leer numeros e imprimir negativos.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/19)
 */
import java.util.Scanner;
public class Secuencia
{

    public static void main(String args[]){

        Scanner scan= new Scanner(System.in);
        int num;

        System.out.print("Ingrese los numeros separados por espacios:");
        num=scan.nextInt();

        while(num!=0){

            num=scan.nextInt();
            if(num<0){
                System.out.print(num);
            }
        }
    }
}
