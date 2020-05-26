/**
 * 
 * @author(Jacobo )
 * @version(2020/05/25)
 */
import java.util.ArrayList;
public class ColeccionDatos{
    ArrayList<Dato> datos;
    public ColeccionDatos(){
        datos=new ArrayList<>();
    }
  /**
 * El método leerDatos muestra la cantidad total de datos leidos
 * 
 */
    public void leerDatos(){
        datos=Archivo.leerDatos();
        System.out.println(datos.size()+" datos leidas exitosamente.");
    }

    /**
 * El método mostrarDatos muestra la cantidad de datos en el archivo
 * 
 */
    public void mostrarDatos(){
        for(Dato d: datos){
            d.mostrarDato();
        }
        System.out.println(datos.size()+" datos leidas exitosamente.");
    }
}