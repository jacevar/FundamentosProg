/**
 * Esta clase crea la lista del menú, procesa las opciones del menú. El método main inicializa el programa
 * @author(Jacobo )
 * @version(2020/05/25)
 */import java.util.Scanner;
public class Principal{
    private final static int Salir=0;
    private ColeccionDatos cd;
    private ColeccionVelas cv;
    private Scanner scan;
     /**
     * 
     * El constructor Principal Inicializa el Scanner y ColeccionDatos.
     */
    public Principal(){
        scan=new Scanner(System.in);
        cd=new ColeccionDatos();
    }

    /**
     * 
     * El método pedirOpcion muestra la lista del menú con las funcionalidades del sistema 
     * y retorna la opcion elegida.
     * @return opcion
     */
    private int pedirOpcion(){
        int opcion;
        System.out.println("=============\nMENU PRINCIPAL\n============");
        System.out.println("1) Leer Fichero");
        System.out.println("2) Ver Datos");
        System.out.println("3) Cargar mis Velas");
        System.out.println("4) Crear Velas Minuto");
        System.out.println("5) Crear Velas Hora");
        System.out.println("6) Ver Velas");
        System.out.println("7) Guardar mis velas");
        System.out.println("8) Filtrar mis Velas");
        System.out.println("9) Backtesting");
        System.out.println("00) Salir");
        System.out.print("---->");
        opcion=scan.nextInt();
        return opcion;
    }

    /**
     * 
     * El método ProcesarOpcion clasifica las funcionalidades del sistema y recibe la opcion
     * del método anterior para instanciar la funcionalidad que se necesita.
     */
    private void procesarOpcion(int opcion){
        switch(opcion){
            case 1:
            cd.leerDatos();break;
            case 2:
            cd.mostrarDatos();break;

            case 3:
            cv=new ColeccionVelas();
            cv.leerVelas(); break;
            case 4:
            if(cd.datos.size()==0)
                System.out.println("Deben haber datos para crear velas.");
            else{
                cv=new ColeccionVelas(cd.datos);
                cv.crearVelas(1);
            }
            break;

            case 5:
            if(cd.datos.size()==0)
                System.out.println("Deben haber datos para crear velas.");
            else{
                cv=new ColeccionVelas(cd.datos);
                cv.crearVelas(2);
            }
            break;
            case 6:
            if(cv!=null){
                cv.mostrarVelas();
                new Candles("Velas Graficas:  Velas creadas",cv.velas).mostrar();
            }else
                System.out.println("Crea velas para poder mostrarlas.");
            break;
            case 7:
            if(cv!=null)
                cv.guardarVelas();
            else
                System.out.println("Crea velas para poder guardarlas.");
            break;
            case 8:
            cv.FiltrarLasVelas();break;
            case 9:
            if(cv!=null){
                BackTesting bt = new BackTesting(cv);
                System.out.println("1) Crear mis estrategias");
                System.out.println("2) Probar mis estrategias");
                int opcBackTesting=scan.nextInt();
                if(opcBackTesting==1)
                    bt.agregarEstrategia(bt.procesarTipoEstrategia());
                else if(opcBackTesting==2)
                    bt.test();
            }else
                System.out.println("Crea velas primero para hacer el backtesting.");
        }

    }

    /**
     * 
     * El método main ejecuta las funcionalidades del sistema, se instancia la clase Principal y se ejecutan sus metodos.
     */
    public static void main(String[] args){
        Principal ejecutar = new Principal();
        int opcion=-1;   
        do{
            opcion=ejecutar.pedirOpcion();
            ejecutar.procesarOpcion(opcion);
        }while(opcion!=Salir);
    }

}
