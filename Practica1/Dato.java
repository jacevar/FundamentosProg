
/**
 * En esta clase se maneja la información de un dato.
 *
 * @author Helmuth Trefftz
 * @version Mayo, 2020
 */
public class Dato
{
    private int codigo;
    private String nombre;
    
    /***
     * Constructor de la clase Dato.
     * @ param codigo Código de la persona
     * @ param nombre Nómbre de la persona
     */
    public Dato(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    /**
     * Método para acceder al código de la persona.
     * 
     * @return Código de la persona
     */
    public int getCodigo() {
        return this.codigo;
    }
    /**
     * Método para acceder al nombre de la persona.
     * 
     * @return Nombre de la persona
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Método para imprimir el contenido de un dato.
     */
    public String toString() {
        String ret = "";
        ret += codigo + " ";
        ret += nombre;
        return ret;
    }
}
