
/**
 * contIncr2.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/02/2)
 */
public class ContIncr2
{
    private int cont;
    private int incr;
    public int init;
    
    public ContIncr2(){
     cont=0;
     incr=1;
     init=0;
    }
    
    public ContIncr2(int i){
     cont=0;
     incr=i;
     init=0;
    }
    
    public ContIncr2(int c, int i){
     cont=c;
     incr=i;
     init=c;
    }
    
    public void estIncr(int i){
     incr=i;
    
    }
    
    public void incr(){
     cont= cont+incr;
     
    }
    
    public int obtCont(){
     return cont;
    }
     
    public void reiniciar(){
     cont=init;
    }
    
    
    
    
    
   
}
