import java.util.ArrayList;
public class ColeccionDatos{
    ArrayList<Dato> datos;
    public ColeccionDatos(){
        datos=new ArrayList<>();
    }

    public void leerDatos(){
        datos=Archivo.leerDatos();
        System.out.println(datos.size()+" datos leidas exitosamente.");
    }

    public void mostrarDatos(){
        for(Dato d: datos){
            d.mostrarDato();
        }
        System.out.println(datos.size()+" datos leidas exitosamente.");
    }
}