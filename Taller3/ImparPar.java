
/**
 * Write a description of class ImparPar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ImparPar
{
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        int n;
        System.out.print("ingrese valor entero:");
        n= scan.nextInt();

       if(n % 2==0){
        System.out.print("Par");
        }
       else{
        System.out.print("Impar");
        } 
       
    }
    }

