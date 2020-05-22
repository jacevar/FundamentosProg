
/**
 * Write a description of class MostrarContenido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class MostrarContenido
{
    public static void main(String []args){

        try{
            File file = new File("data/grades.csv");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

        }
        catch(FileNotFoundException fnfe){
            System.out.print(fnfe);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}
