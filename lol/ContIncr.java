
/**
 * incrementar cont.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/2)
 */
public class ContIncr
{
    private int cont;
    private int incr;
    
    public ContIncr(){
    cont=0;
    incr=1;
    }
    
    public ContIncr(int c, int i){
    cont=c;
    incr=i;
    }
    
    public void estIncr(int i){
    incr=i;
    }
    
    public void incr(){
    cont = cont+incr;
    }
    
    public int obtCont() {
    return cont;
    }
    
    public void reiniciar(){
        cont=0;
        }
     
    
}
