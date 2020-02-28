/**
 * Write a description of class CosteDestruccion here.
 *
 * @author (Jacobo Rave Londoño)
 * @version (2020/02/28 )
 */
import java.util.Scanner;

public class CosteDestruccion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km,arma; long acumulador=0;
        long costo1=0,costo2=0,costo3=0,costototal=0;
        
        System.out.print("Ingrese el numero de kilometros cuadrados que quiere destruir  ");
        km=scan.nextInt();
        System.out.println("Ingrese el tipo de arma");
        arma=scan.nextInt();
        
         while(scan.hasNextInt()){
           
         if(arma==0)
          costo1=(km*300000);
         else if(arma==1)
          costo2=(km*100000);
         else if(arma==2)
          costo3=(km*100);
          km=scan.nextInt();
          arma=scan.nextInt();
          acumulador=costo1+costo2+costo3;
        }
        costototal=costo1+costo2+costo3;
        System.out.print("Costo= "+ costototal);
    }
}
