/**
 * Wvueltas de formula 1.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/7)
 */
import java.util.*;
public class Marca3
{
    public static void main(String []args)
    {
        Scanner scan =new Scanner(System.in);

        float vuelta1, vuelta2, vuelta3;

        System.out.print("Entrada vuelta1, vuelta 2, vuelta3: "); 
        vuelta1= scan.nextFloat();
        vuelta2= scan.nextFloat();
        vuelta3= scan.nextFloat();

        float menor;
        if(vuelta1<vuelta2){
            if(vuelta1<vuelta3){
                menor=vuelta1;
            }
            else
            { 
                menor=vuelta3;
            }

        }
        else{
            if(vuelta2<vuelta3){
                menor=vuelta2;
            }
            else{
                menor=vuelta3;
            }

        }

        System.out.println("La menor: " + menor);
        float p= (vuelta1+vuelta2+vuelta3)/3.0f;
        System.out.println("El prom: "+p);
    }

}