package contadores;


/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador
{
  private int inicial;
  private int contador;
  private int incr;
  
  public contador(int contador, int incr, int oinicial){
    this.inicial=inicial;
    this.contador=contador;
    this.incr=incr;
    }
    
    public void incrementar(){
    contador += incr;
    }
    
    public void reiniciar(){
    contador=inicial;
    }
    
    public int obtContador() {
       return contador;
   }
}