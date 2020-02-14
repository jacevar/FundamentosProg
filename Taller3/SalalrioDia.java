
/**
 * .
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/11)
 */
import java.util.Scanner;
public class SalalrioDia
{
    public static void main(String args[]){

        int dia;
        float salario;
        boolean error=false;
        Scanner scan= new Scanner(System.in);

        System.out.print("Ingrese el dia de la semana en numero siendo lunes 1, martes 2, miercoles 3, jueves 4, viernes 5, sabado 6, domingo 7: ");  
        dia=scan.nextInt();
        System.out.print("Ingrese su salario, para que se le aplique un aumento: ");
        salario=scan.nextFloat();
        if(dia==1){
            salario= salario*1.455f;}
        else{
            if(dia==2 || dia==3){

                salario=salario;}         
            else{

                if(dia==4){

                    salario=salario*1.10f;}                
                else{

                    if(dia==5){

                        salario=salario*1.295f; }                
                    else{
                        if(dia==6){
                            salario=salario*1.559f; }                       
                        else{
                            if(dia==7){
                                salario=salario*1.75f;}
                            else{
                                error=true;
                            }
                        }

                    }
                }
            }
        }
        if(!error){
            System.out.print("Salario: "+salario);}
        else{
            System.out.print("Error codigo dia equivocado");
        }
    }
}