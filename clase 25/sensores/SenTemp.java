package sensores;


/**
 * Write a description of class SenTemp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import util.GenUniforme;
import java.util.ArrayList;
import escuchas.EscuchaTempCambio;
public class SenTemp
{
    private GenUniforme genUniforme;
    private double temp;
    private ArrayList<EscuchaTempCambio> escuchas;
    
    public SenTemp(double Temp){
    this.temp=temp;
    genUniforme=new GenUniforme(-1.9,2.9);
    escuchas = new ArrayList<>();
    }
    
    // public double obtTemp(){
      // temp+=genUniforme.obtSig();
      // return temp;
    // }
    
    public void estTemp(){
     temp+=genUniforme.obtSig();
     for(EscuchaTempCambio etc : escuchas)
     {etc.registrarCambio();}
    }
    
    public double obtTemp(){
    return temp;
    }
    
    public void registrarEscucha(EscuchaTempCambio etc){
    escuchas.add(etc);
    }
}