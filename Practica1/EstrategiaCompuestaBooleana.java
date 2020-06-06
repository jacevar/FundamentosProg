
/**
 * Esta clase es la Estrategia Compuesta boleana y combina las dos anteriores
 *
 * @author (Jacobo Rave L)
 * @version (2020/06/04)
 */


public class EstrategiaCompuestaBooleana extends Estrategias{
  Estrategias est1,est2;
/**
 * El constructor EstrategiaCompuestaDeCruces inicializa los atributos con los parametros
 * @param est1
 * @param est2
 */
public EstrategiaCompuestaBooleana(Estrategias est1,Estrategias est2){
  this.est1=est1;
  this.est2=est2;
}

/**
 * El metodo decidir compara las dos estrategias anteriores y decide
 * @param fecha
 * @param hora
 * @return invertir
 */
  public boolean decidir(int fecha, int hora){
    boolean invertir= est1.decidir(fecha,hora)&&est2.decidir(fecha,hora);
    return invertir;
  }
}
