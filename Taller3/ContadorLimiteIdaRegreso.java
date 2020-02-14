
/**
 * .ContadorLimiteIdaRegreso
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/13)
 */
public class ContadorLimiteIdaRegreso
{
  private int valorActual;
  private int LimiteInf;
  private int LimiteSup;
  private int incr;
  public ContadorLimiteIdaRegreso(int lim1, int lim2){
     
      if (lim1 < lim2){
          LimiteInf = lim1;
          LimiteSup = lim2;
        }else{
            LimiteInf = lim2;
            LimiteSup = lim1;
        }
        
        valorActual=LimiteInf;
        incr=1;
  }
  
  public int obtActual(){
    if(valorActual==LimiteInf && incr==-1){
            incr=1;        
        }
        else if(valorActual==LimiteSup && incr==1){
            incr=-1;

        }

        int ret= valorActual;//Ret se volvio valor actual
        valorActual += incr;//0+1=1
        return ret;//1System.out.print(1)

    }
}
