
/**
 * Obtener la raiz cuadrada de cualquier numero entero positivo.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/22)
 */
import java.util.Scanner;
public class RaizCuadrada
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double w, x, xAnt;
        w=scan.nextDouble();
        x=w;
        do{
            xAnt=x;
            x=(xAnt + w/xAnt) / 2.0;
        }
        while(Math.abs(x - xAnt) > 1e-10);
        System.out.print("raizc: " + "(" +w+ ") "+"= " + x);
    }
}
