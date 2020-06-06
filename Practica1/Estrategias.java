
/**
 * Esta clase abstracta es para poner la accion principal de las estrategias, decidir
 *
 * @author (Jacobo Rave L)
 * @version (2020/06/04)
 */

public abstract class Estrategias{
    /**
     * El método decidir es para ser heredado
     * @param fecha
     * @param hora
     */
    public abstract boolean decidir(int fecha,int hora);
}
