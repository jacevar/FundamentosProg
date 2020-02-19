
/**
 * correcto si lee un valor entre 1 y 10 .
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/19)
 */
import java.util.Scanner;
public class Correcto
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        int num;

        do {
            System.out.print("Entre un valor entre 1 y 10 inclusive: ");
            num = scan.nextInt();
        }
        while(num <1|| num >10);
        System.out.println("valor: " + num);
    }
}
