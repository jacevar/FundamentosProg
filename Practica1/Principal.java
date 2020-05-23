
/**
 * Ejemplo de una clase principal.
 * En esta clase se interactúa con el usuario pidiéndole
 * las acciones que desea desear mediante un menú texto
 * por la consola.
 *
 * @author Helmuth Trefftz
 * @version Mayo, 2020
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Principal
{
    
    /**
     * Opción para leer archivo
     */
    public static final int LEER_ARCHIVO = 1;
    
    /**
     * Opción para ordenar por código
     */
    public static final int ORDENAR_POR_CODIGO = 2;
    
    /**
     * Opción para imprimir la colección
     */
    public static final int IMPRIMIR = 3;
    
    /**
     * Opción para escribir archivo
     */
    public static final int ESCRIBIR_ARCHIVO = 4;
     
    /**
     * Opción para terminar el programa
     */
    public static final int TERMINAR = 99;
    
    /**
     * Esta es la colección de datos.
     * Solo hay una activa en un momento dado.
     */
    private ColeccionDatos cd;
    
    /**
     * Scanner para leer datos que ingresa el usuario
     */
    private Scanner in;
    
    public Principal() {
        cd = new ColeccionDatos();
        in = new Scanner(System.in);
    }
    
    /**
     * Este método le pide al usuario que ingrese el
     * número que representa la acción que desea llevar a cabo.
     * 
     * @return Retorna el número de la opción escogida por el 
     * usuario.
     */
    private int pedirOpcion() {
        System.out.println("=====");
        System.out.println("Por favor escoja entre las siguientes opciones:");
        System.out.println(LEER_ARCHIVO + ". Leer archivo");
        System.out.println(ORDENAR_POR_CODIGO + ". Ordenar lista por código");
        System.out.println(IMPRIMIR + ". Imprimir la colección");
        System.out.println(ESCRIBIR_ARCHIVO + ". Escribir archivo");
        System.out.println(TERMINAR + ". Terminar");
        
        int opcion = in.nextInt();
        return opcion;
    }
    
    /**
     * Este método recibe el número de la opción que el usurio
     * quiere llevar a cabo e invoca el método correspondiente.
     * 
     * @param opción Número de la opción escogida por el usuario.
     */
    private void procesarOpcion(int opcion) throws IOException {
        if(opcion == LEER_ARCHIVO) {
            try {
                System.out.println("Por favor ingrese el nombre del archivo a leer: ");
                String nombre = in.next();
                //cd.leerArchivo(nombre);
                throw new IOException("I am Exception Alpha!");
            } 
            
            catch (FileNotFoundException e)  {
                //throw new FileNotFoundException("no se encuentra");
                System.out.println("El archivo no existe " + e.getMessage());
            }
        } else if (opcion == ORDENAR_POR_CODIGO) {
            //cd.ordenarPorCodigo();
        } else if(opcion == IMPRIMIR) {
            //cd.imprimir();
        } else if (opcion == ESCRIBIR_ARCHIVO) {
            try {
                System.out.println("Por favor ingrese el nombre del archivo a escribir: ");
                String nombre = in.next();
               // cd.escribirArchivo(nombre);
               throw new IOException("Archivo no encontrado");
            } catch (FileNotFoundException e) {
                System.out.println("No se pudo realizar la operación: " + e.getMessage());
            }
            
        } else {
            System.out.println("Opción inválida. Por favor intente de nuevo");
        }
    }
    
    /**
     * Programa principal.
     * El ciclo principal consiste en pedirle al usuario una
     * opción y luego se invoca el método correspondiente
     * para llevar a cabo la acción deseada.
     * 
     * @param args Opciones para ejecutar el programa.
     * No se usan en esta aplicación.
     */
    public static void main(String [] args) {
        // Principal p = new Principal();
        // int opcion = p.pedirOpcion();
        // while (opcion != TERMINAR) {
            // //p.procesarOpcion(opcion);
            // opcion = p.pedirOpcion();
        // }
        ColeccionDatos col = new ColeccionDatos();
        ArrayList<Datos> datos = new ArrayList();
        datos = col.getList();
        int total = datos.size();
        int velaType=1;
        for(int i = 0 ; i<total ; i++){
        
       System.out.println(Double.toString(datos.get(i).last)+ " " + " "+ datos.get(i).fecha + " " +  datos.get(i).hora + " " +  datos.get(i).min);
        
        
        }
       ColeccionVelas colec = new ColeccionVelas();
       ArrayList<Velas> velas = new ArrayList();
       velas=colec.crearVelas(velaType, datos);
        System.out.println("El programa ha terminado. Gracias.");
    }
}
