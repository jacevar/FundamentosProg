
/**
 * Write a description of class ColeccionDatos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
public class ColeccionDatos
{
    public List datos;
    
    
    public static void main(String[] args){
    
        getList();
        getNumDatos();
    }

    public static ArrayList<Datos> getList(){
        ArrayList<Datos> colDatos= new ArrayList();
        List<String> listLineas = UtilidadesArchivo.leerArchivo("C:/Users/jac/Desktop/nq20200429-09-10.txt");
        //System.out.println(listLineas.size());
        
        for(String line : listLineas){
            Datos datos = new Datos( );
            
            String[] arrayLine = line.split(";");
           // System.out.println(arrayLine[0]);
            String[] arrayDate = arrayLine[0].split(" ");
            //System.out.println(arrayDate[0]);
            int fecha = Integer.parseInt(arrayDate[0]);
           // System.out.println(fecha);
            int hora = Integer.parseInt(arrayDate[1]);
           // System.out.println(hora);
            int min = Integer.parseInt(arrayDate[2]);
           // System.out.println(min);
            // double bid = Double.parseDouble(arrayLine[1]);
            // System.out.println(bid);
            // double ask = Double.parseDouble(arrayLine[2]);
            // System.out.println(ask);
            double last = Double.parseDouble(arrayLine[3]);
            //System.out.println(last);
            int trans = Integer.parseInt(arrayLine[4]);
            //System.out.println(trans);
            
            
            datos.fecha=fecha;
            datos.hora=hora;
            datos.min=min;
            datos.last=last;
            datos.trans=trans;
            
            colDatos.add(datos);                         
             // Datos dato = new Datos( fecha,  hora, 
                                    // n,   bid,
                                    // ask,   last,  trans);
        }
        
       
        
        return colDatos;
    }
    
    public static List<Datos> getNumDatos(){
    List<String> listLineas = UtilidadesArchivo.leerArchivo("C:/Users/jac/Desktop/nq20200429-09-10.txt");
        System.out.println("El total de datos "+listLineas.size());
        
        return null;
    }
} 

