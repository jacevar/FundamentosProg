/**
 * Esta clase es para contener todos los datos del archivo
 * @author(Jacobo )
 * @version(2020/05/25)
 */
import java.util.ArrayList;
public class ColeccionDatos{
    ArrayList<Dato> datos;
    
    /**
     * el constructor ColeccionDatos inicializa el arraylist
     */
    public ColeccionDatos(){
        datos=new ArrayList<>();
    }
  /**
 * El método leerDatos lee todos los datos y dice la cantidad total de datos leidos
 * 
 */
    public void leerDatos(){
        datos=Archivo.leerDatos();
        System.out.println(datos.size()+" datos leidas exitosamente.");
    }

    /**
 * El método mostrarDatos muestra todos los datos leidos y dice
 * la cantidad de datos en el archivo 
 */
    public void mostrarDatos(){
        for(Dato d: datos){
            d.mostrarDato();
        }
        System.out.println(datos.size()+" datos leidas exitosamente.");
    }
}