
/**
 * lea una secuencia desconocida de valores doubles y si el valor es mayor o igual al valor anterior, suma 1 al contador. en caso
contrario resta 1 al contador y muestra que esta decrementando en un unidad y al
final muestra la suma total de los valores contados.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/20)
 */
import java.util.Scanner;
public class ContMIncrMDecr
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        double valor=0, valor1=0;
        int acumulador=0;
        System.out.println("Ingresar valores");
        while(scan.hasNextDouble()){
            
            valor=scan.nextDouble();
           
            if(valor>=valor1){
                acumulador++;
                System.out.println("+1");
            }
            else if(valor<valor1) {
                acumulador--;
                System.out.println("-1");}

             valor1 = valor;
        }
        System.out.println(acumulador);
    }
}
