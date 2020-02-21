
/**
 * Write a description of class DiferenciadeN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DiferenciadeN
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=0, numAnt=0;
        int n;
        System.out.print("Ingrese un numero");

        n=scan.nextInt();
        
        for(int i=0; i<n; i++){
            num=scan.nextInt(); 

            if(i>0){

                System.out.print("Diferenca: "+(numAnt-num));
                numAnt=num;
            }

            
        }

    }
}
