
/**
 * Esta clase crea los valores del Indicador.
 *
 * @author (Jacobo Rave L)
 * @version (2020/06/04)
 */
public class Indicador
{
    int fecha;
    int hora;
    Double valor;
    /**
     * 
     * El constructor Inicializa los atributos con los parametros dados
     * @param fecha
     * @param hora
     * @param valor
     */
    public Indicador(int fecha, int hora, Double valor){
        this.fecha=fecha;
        this.hora=hora;
        this.valor=valor;
    }

    /**
     * El método getIndicador crea cada renglon de indicador con sus atributos
     * @return renglon con los datos fecha,hora y valor.
     */
    public String getIndicador(){
      return fecha+" "+hora+" "+valor;
    }
}
