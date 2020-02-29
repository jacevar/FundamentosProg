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
        long costo1=0,costototal=0;
        
         while(scan.hasNextInt()){
           
          km=scan.nextInt();
          arma=scan.nextInt();
         if(arma==0)
          costo1=(km*300000l);
         else if(arma==1)
          costo1=(km*100000l);
         else if(arma==2)
          costo1=(km*100l);
         
          costototal+=costo1;
        }
        
        System.out.print("Costo= "+ costototal);
    }
}
