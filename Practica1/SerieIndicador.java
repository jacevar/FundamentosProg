
 /**
  * Esta clase muestra la lista de los Indicadores
 * @author (Jacobo Rave L)
 * @version (2020/06/04)
 */
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public abstract class SerieIndicador
{
    ArrayList<Indicador> indicador = new ArrayList<Indicador>();
    ColeccionVelas cv;
    int n;
    
    /**
     * 
     * El constructor SerieIndicador inicializa los parametros cv y n con los parametros que le pasa 
     * @param cv 
     * @param n
     */
    public SerieIndicador(ColeccionVelas cv,int n){
        this.cv=cv;
        this.n=n;
    }
    
    /**
     * El constructor mostrarIndicador 
     * @param
     * @param
     */
    public void mostrarIndicador(int fecha, int hora){
      for(int i=0;i<indicador.size();i++){
       // if(fecha<=indicador.get(i).fecha && hora<=indicador.get(i).hora)
          System.out.println(indicador.get(i).getIndicador());
      }
    }

}
