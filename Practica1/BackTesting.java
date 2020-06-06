
/**
 * Esta clase es para probar las estrategias
 *
 * @author (Jacobo Rave L)
 * @version (2020/06/04)
 */

import java.util.ArrayList;
import java.util.Scanner;
public class BackTesting{
    static ArrayList<Estrategias> estrategias=new ArrayList<>();
    static ColeccionVelas cv;
    static ArrayList<String> nombres=new ArrayList<>();

    /**
     * 
     * El constructor BackTesting inicializa ColeccionVelas.
     * @ param cv
     */
    public BackTesting(ColeccionVelas cv){
        this.cv=cv;
    }

    
    /**
     * 
     * El método procesarTipoEstrategia muestra la lista de las estrategias que se pueden utilizar
     *
     */
    public int procesarTipoEstrategia(){
        System.out.println("1) Estrategia Sencilla");
        System.out.println("2) Estrategia Compuesta de Cruce");
        System.out.println("3) Estrategia Booleana");
        System.out.print("--->>");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
/**
 * El método llamarSerieIndicador solicita que tipo de estrategia se va a utilizar si regresion lineal o promedio movil.
 * @return si1 para usarlo despues en el metodo test
 * 
 */
    public SerieIndicador llamarSerieIndicador(){

        Scanner scan = new Scanner(System.in);
        SerieIndicador si1=null;
        int n=0;
        System.out.println("1) Regresion Lineal");
        System.out.println("2) Promedio Movil");

        int tipo=scan.nextInt();
        switch(tipo){
            case 1:

            System.out.print("Longitud: ");
            n=scan.nextInt();
            si1 = new  RegresionLineal(cv,n);
            break;
            case 2:

            System.out.print("Longitud: ");
            n=scan.nextInt();
            si1= new  PromedioMovil(cv,n); break;
        }
        return si1;
    }

    /**
     * El método agregarEstrategia pide el nombre de la estrategia y el tipo de serieIndicador
     * @param tipo
     */
    public void agregarEstrategia(int tipo){
        Scanner scan = new Scanner(System.in);
        String nombre="";
        Estrategias est=null;
        SerieIndicador si1=null;
        switch(tipo){
            case 1:

            System.out.println("Nombre de la estrategia: ");
            nombre=scan.nextLine();
            nombres.add(nombre);
            si1 = llamarSerieIndicador();
            System.out.print("Threshold: ");
            Double threshold = scan.nextDouble();
            est = new EstrategiaSencilla(si1,threshold);
            estrategias.add(est);
            break;
            case 2:

            System.out.println("Nombre de la estrategia: ");
            nombre=scan.nextLine();
            nombres.add(nombre);
            si1 = llamarSerieIndicador();
            SerieIndicador si2 = llamarSerieIndicador();

            est = new EstrategiaCompuestaDeCruces(si1,si2);
            estrategias.add(est);
            break;
            case 3:
            if(estrategias.size()>=2){

                System.out.println("Nombre de la estrategia: ");
                nombre=scan.nextLine();
                nombres.add(nombre);
                String name1,name2;
                System.out.println("Nombre de la estrategia 1: ");
                name1=scan.nextLine();
                System.out.println("Nombre de la estrategia 2: ");
                name2=scan.nextLine();
                int pos1=nombres.indexOf(name1),pos2= nombres.indexOf(name2);
                if(pos1>=0 && pos2>=0){
                    est = new EstrategiaCompuestaBooleana(estrategias.get(pos1),estrategias.get(pos2));
                    estrategias.add(est);
                }
            }
        }
    }

    /**
     * El método test pide la hora y fecha y segun la estrategia si retorna true, decide invertir le suma uno al contador
     * 
     */
    public void test(){
        Scanner scan=new Scanner(System.in);
        int cont=0,fecha=0,hora=0;
        System.out.println("Insertar Hora: ");
        hora=scan.nextInt();
        System.out.println("Insertar Fecha: ");
        fecha=scan.nextInt();
        for(int i=0;i<estrategias.size();i++){
            if(estrategias.get(i).decidir(fecha,hora))
                cont++;
        }
        System.out.println(cont+" de "+estrategias.size()+" recomiendan que invierta.");
    }
}
