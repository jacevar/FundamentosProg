import java.util.*;
import java.io.File;
import java.io.PrintStream;
/**
 * Esta clase crea las velas, las filtra y las graba
 * @author(Jacobo )
 * @version(2020/05/25)
 */
public class ColeccionVelas
{
    private ArrayList<Dato> datos;
    ArrayList<Vela> velas;
    private ArrayList<Vela> velasFiltradas;
     /**
  * Este constructor es para poder inicializar
  * .
  * 
  */
    public ColeccionVelas(){

    }
    
  /**
  * Este constructor es para controlar el arrayList de Vela 
  * @param  ArrayList<Dato> datos es para designar datos de la clase Dato a datos de la clase ColeccionVelas.
  * 
  */
    public ColeccionVelas(ArrayList<Dato> datos){
        this.datos=datos;
        velas=new ArrayList<>();
    }

    /**
     * El metodo leerVelas hace un llamado al metodo de la clase Archivo, el cual devuelve las Velas de un archivo
     * que ha sido cargado previamente.
     */
    public void leerVelas(){
        velas=Archivo.leerVelas();
        System.out.println(velas.size()+" velas leidas exitosamente.");
    }

    /**
     * El metodo crearVelas crea las Velas o por minutos o por horas, segun el parametro pasado por el usuario.
     * @param tipoVela es la variable que trae el tipo de Velas a crear por parte del usuario.
     */
    public void crearVelas(int tipoVela){
        velas.clear();
        boolean firstTime=true;
        int tiempo=0,tiempoActual=-1,aux=0,Volumen=0;
        
         int Fecha,Hora;
         double Maximo=0,Minimo=Double.MAX_VALUE,Inicial,Final;
         String Color; 
        
        for(int i=0;i<datos.size();i++){
            if(tipoVela==1){
                tiempo=datos.get(aux).getMinutos(); 
                tiempoActual=datos.get(i).getMinutos(); 
            }else if(tipoVela==2){
                tiempo=datos.get(aux).getHoras();
                tiempoActual=datos.get(i).getHoras();
            }

           
            Fecha=datos.get(aux).Fecha;
            Hora=datos.get(aux).Hora;
            Inicial=datos.get(aux).Last;
            Final=datos.get(i).Last;
            Color=(Final>Inicial)?"Verde":"Rojo";
            Maximo=Math.max(Final,Maximo);
            Minimo=Math.min(Final,Minimo);
            Volumen+=datos.get(i).nTrans;
            if(firstTime && i==datos.size()-1){
                Vela v=new Vela(Color,Fecha,Hora,Maximo,Minimo,Inicial,Final,Volumen);
                velas.add(v);
                firstTime=false;
                Volumen=0;
            }else if(tiempo-tiempoActual!=0){
                aux=i;
                i--;
                Vela v=new Vela(Color,Fecha,Hora,Maximo,Minimo,Inicial,Final,Volumen);
                velas.add(v);
                Volumen=0;
            }
        }
        System.out.println(velas.size()+" velas creadas exitosamente.");
    }
    
    /**
    * El metodo mostrarVelas muestra las Velas o por minutos o por horas.
    * 
    */
    public void mostrarVelas(){
        for(Vela v : velas){
            System.out.println(v.getVela());
        }
        System.out.println(velas.size()+" velas mostradas exitosamente.");
    }

    /**
    * El metodo guardarVelas hace un llamado a la clase Scanner y archivo para leer el nombre de 
    * como se va a llamar el archivo nuevo. Captura una excepcion y guarda las Velas o por minutos o por horas.
    * 
    */
    public void guardarVelas(){
        Scanner scan = new Scanner(System.in);
        File archivo=null;
        System.out.println("Inserte el nombre con el que guardara el archivo: ");
        String name=scan.next();
        try{

            archivo = new File(name);
            PrintStream guardado = new PrintStream(archivo);
            for(Vela v:velas){
                guardado.println(v.getVela());
            }
            System.out.println(velas.size()+" velas guardadas exitosamente.");
            guardado.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    
    /**
    * El método FiltrarLasVelas da el menú de los tipos de filtrados que hay y segun 
    * la opcion se filtra por la eleccion.
    * 
    */
    public void FiltrarLasVelas(){
        Scanner scan=new Scanner(System.in);
        int opcion=-1;
        int Fecha=0,Hora=0,tamanio=0,extension=0;
        String Color="";
        do{
            System.out.println("1) Filtrar por Hora y Fecha");
            System.out.println("2) Filtrar por Color");
            System.out.println("3) Ordenar por tamanio");
            System.out.println("4) Ordenar por extension");
            System.out.println("5) Realizar filtrado");
            System.out.println("6) Grabar velas filtradas");
            System.out.println("00) Volver a principal");
            opcion=scan.nextInt();
            switch(opcion){
                case 1:
                System.out.println("Fecha: "); Fecha=scan.nextInt();
                System.out.println("Hora: "); Hora=scan.nextInt();
                break;
                case 2:
                System.out.println("Color: "); Color=scan.next();
                break;
                case 3:
                tamanio=1;
                extension=0;
                break;
                case 4 :
                extension=1;
                tamanio=0;
                break;
                case 5:
                filtrarVelitas(Fecha,Hora,Color,tamanio,extension);break;
                case 6:
                grabarFiltradas();

            }

        }while(opcion!=0);
    }

    /**
     * El metodo filtrarVelitas es el encargado de filtrar las velas de acuerdo a los
     * parametros del usuario y la opcion de ordenamiento.
     * @param Fecha
     * @param Hora
     * @param Color
     * @param tamanio
     * @param extension
     */
    private void filtrarVelitas(int Fecha, int Hora, String Color, int tamanio, int extension){
        velasFiltradas=new ArrayList<>();
        //Filtrado por Fecha, Hora y Color
        for(Vela v:velas){
            if(Fecha>v.Fecha)
                continue;
            if(Hora>v.Hora)
                continue;    
            if(Color.length()>0)
                if(!v.Color.equalsIgnoreCase(Color))
                    continue;
            velasFiltradas.add(v);
        }
        //Ordenamiento por Tamanio
        if(tamanio==1){
            for(int i=0;i<velasFiltradas.size();i++){
                for(int j=i;j<velasFiltradas.size();j++){
                    if(velasFiltradas.get(i).Tamanio<velasFiltradas.get(j).Tamanio){
                        Vela temp = velasFiltradas.get(i);
                        velasFiltradas.set(i,velasFiltradas.get(j));
                        velasFiltradas.set(j,temp);
                    }
                }
            }
        }
        //Ordenamiento por extension
        if(extension==1){
            for(int i=0;i<velasFiltradas.size();i++){
                for(int j=i;j<velasFiltradas.size();j++){
                    if(velasFiltradas.get(i).Extension<velasFiltradas.get(j).Extension){
                        Vela temp = velasFiltradas.get(i);
                        velasFiltradas.set(i,velasFiltradas.get(j));
                        velasFiltradas.set(j,temp);
                    }
                }
            }
        }
        //Ya que se cumplieron todos los filtros, se muestran
        System.out.println("Mostrado de velas: ");
        for(Vela v:velasFiltradas){
            System.out.println(v.getVela());
        }
        System.out.println(velasFiltradas.size()+" velas filtradas exitosamente.");
    }

    /**
     * El metodo grabarFiltradas hace instancia de la clse archivo y es el encargado 
     * de grabar las velas de acuerdo con la filtracion.
     * 
     */
    private void grabarFiltradas(){
        Scanner scan = new Scanner(System.in);
        File archivo=null;
        System.out.println("Inserte el nombre con el que guardara el archivo: ");
        String name=scan.next();
        if(velasFiltradas!=null)
            try{

                archivo = new File(name);
                PrintStream guardado = new PrintStream(archivo);
                for(Vela v:velasFiltradas){
                    guardado.println(v.getVela());
                }
                System.out.println(velasFiltradas.size()+" velas grabadas exitosamente.");
                guardado.close();
            }catch(Exception e){
                System.out.println(e.getMessage());

            }
        else
            System.out.println("Filtre primero las velas para poder guardarlas.");
    }
}

