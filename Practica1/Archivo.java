/**
 * 
 * @author(Jacobo )
 * @version(2020/05/25)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Archivo{
    private static Scanner scan;
    /**
 * 
 * 
 * El método leerDatos instancia la clase Dato y lee los datos del archivo uno por uno paa introducirlos en un array nuevo
 */
    public static ArrayList<Dato> leerDatos(){
        ArrayList<Dato> datos=new ArrayList<>();
        System.out.println("Por favor inserta la ruta del archivo: ");
        scan = new Scanner(System.in);
        String ruta = scan.nextLine();//NQ20200429-30.txt
        File archivo=null;
        try{
            archivo= new File(ruta);
            scan = new Scanner(archivo);
            while(scan.hasNextLine()){
                String linea = scan.nextLine().replace(";"," ");
                Scanner line = new Scanner(linea);
                int Fecha=line.nextInt();
                int Hora=line.nextInt();
                int Millonesimas=line.nextInt();
                double Bid=Double.parseDouble(line.next());
                double Ask=Double.parseDouble(line.next());
                double Last=Double.parseDouble(line.next());
                int nTrans=line.nextInt();
                Dato dato = new Dato(Fecha, Hora, Millonesimas, Bid, Ask, Last,nTrans);
                datos.add(dato);
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return datos;
    }
      /**
 * 
 * 
 * El método leerVelas instancia la clase Dato y lee las velas del archivo.
 */
    public static ArrayList<Vela> leerVelas(){
        ArrayList<Vela> velas=new ArrayList<>();
        System.out.println("Por favor inserta la ruta del archivo: ");
        scan = new Scanner(System.in);
        String ruta = scan.nextLine();//MisVelas.txt
        File archivo=null;
        try{
            archivo= new File(ruta);
            scan = new Scanner(archivo);
            while(scan.hasNextLine()){
                String linea = scan.nextLine().replace(";"," ");
                Scanner line = new Scanner(linea);
                String Color=line.next();
                int Fecha=line.nextInt();
                int Hora=line.nextInt();
                double Maximo=Double.parseDouble(line.next());
                double Minimo=Double.parseDouble(line.next());
                double Inicial=Double.parseDouble(line.next());
                double Final=Double.parseDouble(line.next());
                int Volumen=line.nextInt();
                Vela velita = new Vela(Color, Fecha, Hora, Maximo, Minimo, Inicial, Final, Volumen);
                velas.add(velita);
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return velas;
    }
}