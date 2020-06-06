
/**
 * Esta clase es para emplear la estrategia sencilla
 * @author (Jacobo Rave L)
 * @version (2020/06/04)
 */

public class EstrategiaSencilla extends Estrategias{
    SerieIndicador si;
    double threshold;

    /**
     * El constructor EstrategiaSencilla es para inicializar las varibles con los parametros
     * @param si
     * @param threshold
     */
    public EstrategiaSencilla(SerieIndicador si, double threshold){
        this.si=si;
        this.threshold=threshold;
    }

    /**
     * El método decidir es para hacer una prediccion con los datos y decir si invierte o no.
     * @param fecha
     * @param hora
     * @return invertir
     */
    public boolean decidir(int fecha, int hora){
        boolean invertir=false;
        for(int i = 0; i<si.indicador.size() ; i++){
            if(fecha<=si.indicador.get(i).fecha && hora<=si.indicador.get(i).hora){
                if(si.indicador.get(i).valor!=null && si.indicador.get(i).valor-threshold>0.5){
                    invertir=true;
                    break;
                }
            }
        }
        return invertir;
    }
}
