package escuchas;


/**
 * Write a description of class EscuchaTemCambio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import sensores.SenTemp;
public class EscuchaTempCambio
{
   SenTemp senTemp;
   public EscuchaTempCambio(SenTemp senTemp){
      this.senTemp = senTemp;
      senTemp.registrarEscucha(this);
    }
    
    public void registrarCambio(){
        
     System.out.printf("%03.2f\n",senTemp.obtTemp());
        
    }
}
