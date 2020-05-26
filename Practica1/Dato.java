/**
 * 
 * @author(Jacobo )
 * @version(2020/05/25)
 */public class Dato{
    int Fecha, Hora, Minutos, nTrans, Millonesimas;
    double Last,Bid, Ask;
     /**
     * El constructor Dato constructor recibe unos parametros para designar ls atributos de los datos.
     *
     *@param Fecha
     *@param Hora
     *@param Millonesimas
     *@param Bid
     *@param Ask
     *@param Last
     *@param nTrans
     *
     */
    public Dato(int Fecha, int Hora,int Millonesimas, double Bid, double Ask, double Last, int nTrans){
        this.Fecha=Fecha;
        this.Hora=Hora;
        this.Millonesimas=Millonesimas;
        this.Bid=Bid;
        this.Ask=Ask;
        this.Last=Last;
        this.nTrans=nTrans;
        this.Minutos=(Hora/100)%100;
    }
    /**
     * El método mostrarDato muestra los datos del archivo txt.
     */
    public void mostrarDato(){
        System.out.println(Fecha+" "+Hora+" "+Millonesimas+" "+Bid+";"+Ask+";"+Last+";"+nTrans);   
    }
    /**
     * El método getMinutos obtiene los minutos de los datos.
     */
    public int getMinutos(){
        return Minutos;
    }
    /**
     * El método getHoras obtiene las horas de los datos.
     */
    public int getHoras(){
        return Hora/10000;
    }
}