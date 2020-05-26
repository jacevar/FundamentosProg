/**
 * 
 * @author(Jacobo )
 * @version(2020/05/25)
 */
public class Vela
{
    int Fecha, Hora, Volumen;
    double Inicial, Final, Maximo, Minimo, Extension, Tamanio,mechaSuperior,mechaInferior;
    String Color;

    /**
     * El constructor Vela recibe unos parametros para designar ls atributos de Vela.
     *@param Color
     *@param Fecha
     *@param Hora
     *@param Maximo
     *@param Minimo
     *@param Inicial
     *@param Final
     *@param Volumen
     *
     */
    public Vela(String Color, int Fecha, int Hora, double Maximo, double Minimo, double Inicial, double Final, int Volumen){
        this.Color=Color;
        this.Fecha=Fecha;
        this.Hora=Hora;
        this.Maximo=Maximo;
        this.Minimo=Minimo;
        this.Inicial=Inicial;
        this.Final=Final;
        this.Volumen=Volumen;
        this.mechaSuperior=Math.abs(Final-Maximo);
        this.mechaInferior=Math.abs(Final-Minimo);
        this.Tamanio=Maximo-Minimo;
        this.Extension=Final-Inicial;
    }
    /**
     * 
     * El método getVela es para obtener la vela con sus atributos
     */
    public String getVela(){
        return Color+" "+Fecha+" "+Hora+" "+Maximo+" "+Minimo+" "+Inicial+" "+Final+" "+Volumen;
    }
}

