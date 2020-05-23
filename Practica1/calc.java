
/**
 * Write a description of class calc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class calc
{
    public static void main(String args[]){

        System.out.println("Bienvenido a la calculadora");

        Scanner scan = new Scanner(System.in);

         System.out.println("primer numero");
        int numA = scan.nextInt();
        
         System.out.println("segundo numero");
        int numB = scan.nextInt();

        int sum = numA+numB;
        int res = numA-numB;
        int mul = numA*numB;
        int div = numA/numB;
        
         System.out.println("operacion que desea realizar");
         System.out.println("1: suma  2: resta 3: multiplicación  4: division");
        int op = scan.nextInt();
         
        switch(op){
        
        case(1):
        System.out.print(sum); break;
        
        case(2):
        System.out.print(res);break;
        
        case(3):
        System.out.print(mul);break;
        
        case(4):
        System.out.print(div);break;
        
        default:
        System.out.print("mala operacion");
        }
         

    }  

}
