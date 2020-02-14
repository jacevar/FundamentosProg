
/**
 * Write a description of class SalarioDia3 here.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/12)
 */
import java.util.Scanner;
public class SalarioDia3
{
    public static void main(String args[]){

        int dia;
        float salario;
        int error=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese el dia de la semana en numero siendo lunes 1, martes 2, miercoles 3, jueves 4, viernes 5, sabado 6, domingo 7: ");
        dia=scan.nextInt();
        System.out.print("Ingrese su salario: ");
        salario=scan.nextFloat();

        switch(dia){

            case 1:
            salario=salario*1.445f;
            break;
            case 2:
            case 3:
            break;
            case 4:
            salario=salario*1.10f;
            break;
            case 5:
            salario=salario*1.295f;
            break;
            case 6:
            
            salario=salario*1.559f;
            break;
            case 7:
            salario=salario*1.75f;
            break;
            default:
            error=1;
            break;
        }
        
        switch(error){
            case 1:
            System.out.println("Salario: "+ salario);
            break;
        case 0:
            System.out.print("Error codigo día equivocado: ");
            break;
            
        }
    }
}
