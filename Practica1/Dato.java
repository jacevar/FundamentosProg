public class Dato{
    int Fecha, Hora, Minutos, nTrans, Millonesimas;
    double Last,Bid, Ask;
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

    public void mostrarDato(){
        System.out.println(Fecha+" "+Hora+" "+Millonesimas+" "+Bid+";"+Ask+";"+Last+";"+nTrans);   
    }
    
    public int getMinutos(){
        return Minutos;
    }
    
    public int getHoras(){
        return Hora/10000;
    }
}