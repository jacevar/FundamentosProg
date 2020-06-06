
/**
 * Esta clase es la Estrategia Compuesta de cruces
 *
 * @author (Jacobo Rave L)
 * @version (2020/06/04)
 */

public class EstrategiaCompuestaDeCruces extends Estrategias{
  SerieIndicador ind1,ind2;

  /**
   * El constructor EstrategiaCompuestaDeCruces inicializa los atributos con los parametros
   * @ind1 
   * @ind2
   */
public EstrategiaCompuestaDeCruces(SerieIndicador ind1,SerieIndicador ind2){
  this.ind1=ind1;
  this.ind2=ind2;
}

/**
 * El método decidir decide si invertir o no
 * @fecha
 * @hora
 * @return la deision
 */
  public boolean decidir(int fecha, int hora){
    boolean invertir=false;
    for(int i = 0; i<ind1.indicador.size() ; i++){
      if(hora<=ind1.indicador.get(i).hora && hora<=ind2.indicador.get(i).hora){
        if( (ind1.indicador.get(i).valor!=null && ind2.indicador.get(i).valor!=null ) && (ind2.indicador.get(i).valor-ind1.indicador.get(i).valor)>0.5){
          invertir=true;
          break;
        }
      }
    }
    return invertir;
  }
}
