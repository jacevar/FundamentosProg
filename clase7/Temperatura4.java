
/**
 * Temperatura 4.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/12)
 */
import java.util.Scanner;
public class Temperatura4
{
    public static void main(String args[]){
        int temp; 

        Scanner scan=new Scanner(System.in);

        System.out.print("Temperatura: ");
        temp=scan.nextInt();

        if(temp<100&&temp>0){
            System.out.print("Agua");
        }
    }   
}
