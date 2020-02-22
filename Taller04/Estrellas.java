
/**
 * leer al final del dia la cantidad de estrellas.
 * 
 * @author (Jacobo Rave L) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Estrellas
{
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        int estrellas, total, invalidas=0;
        int estrella0=0, estrella1=0, estrella2=0, estrella3=0, estrella4=0, estrella5=0;

        System.out.print("Ingrese su satisfaccion respecto a el servicio. 1 estrella en malo y 5 es excelente : ");
        estrellas=scan.nextInt();

        while(estrellas>=0)
        {
            if(estrellas==0){
                estrella0++;
            }
            else if(estrellas==1)
                estrella1++;
            else if(estrellas==2)
                estrella2++;
            else if(estrellas==3)
                estrella3++;
            else if(estrellas==4)
                estrella4++;
            else if(estrellas==5)
                estrella5++;
            else if(estrellas>5)
                invalidas++;
            
            
            estrellas=scan.nextInt();    
            }
            total=estrella0+estrella1+estrella2+estrella3+estrella4+estrella5+invalidas;    
            
          

        System.out.println("0"+"("+estrella0+")"+" *"+"("+estrella1+")"+" **"+"("+estrella2+")"+" ***"+"("+estrella3+")"+" ****"+"("+estrella4+")"+" *****"+"("+estrella5+")");
        System.out.print("Total: "+total);
        System.out.print(" Invalidas: " + invalidas);
    }
}
