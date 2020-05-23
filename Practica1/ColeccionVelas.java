
/**
 * Write a description of class ColleccionVelas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ColeccionVelas
{
    Scanner scan = new Scanner(System.in);
    // int numVelas;
    public ArrayList<Velas> crearVelas(int velaType, ArrayList<Datos> datos){
        ArrayList<Velas> coleVela = new ArrayList();
        int numTransCadaVela;
        System.out.print("1: para crear vela de 1 minuto, 2: para crear vela de 1 hora");
        int i=0;
        int tiempo = 0;
        int tiempoActual = 0;
        if(velaType==1){
            tiempo=datos.get(i).min;
            tiempoActual=datos.get(i).min;
        }
        else if (velaType==2){
            tiempo=datos.get(i).hora;
            tiempoActual=datos.get(i).hora;
        }
        //Velas vela = new Velas();
        while(i<datos.size()){
            
            Velas vela = new Velas();
            vela.initPrice = datos.get(i).last;
            vela.lowerPrice = datos.get(i).last;
            vela.higerPrice = datos.get(i).last;
            while(tiempo==tiempoActual){

                if(datos.get(i).last>vela.higerPrice){
                    vela.higerPrice = datos.get(i).last;
                }

                if(datos.get(i).last<vela.lowerPrice){
                    vela.lowerPrice = datos.get(i).last;
                }

                i++;
                if(velaType==1){
                    tiempoActual=datos.get(i).min;
                }
                else if (velaType==2){
                    tiempoActual=datos.get(i).hora;
                }
            }
            vela.finalPrice = datos.get(i).last;

            coleVela.add(vela);
        }
        return coleVela;

    }

    // public int getNumVelas(){
    // }
    
    // // ObtenerCuerpo(){
    // // }
    // // ObtenerMechaSuperior(){
    // // }
    // ObtenerMechaInferior(){
    // }
    // crearVelas(){
    // }
    
    // int GuardarVelas(string formato,string nombre, List<velas> velas){
    // }

    // int LeerColeccionVelas(string nombreArchivo){
    // }

    // ColeccionVelas FiltrarVelas(coleccionVelas vela, int Fecha, int Hora, String Color, string tipo){
    // }

    // ColeccionVelas OrdenarVelas(ColeccionVelas vela, string tipoOrdenamiento)
    // {
    // }

    // ImprimirVelas(coleccionVelas vela)
    // {

    // }

} 