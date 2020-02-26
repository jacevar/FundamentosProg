
/**
 * Calcula el valor de pi aproximado a 15 iteracciones.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/02/26)
 */
public class Aproximación
{   
   public  static void main(String args[]){
        double pi=3.0;
        int den=2;
        for(int i=0;i<15;i++){
            int totalDen;        
            totalDen=den*(den+1)*(den*2);
            den+=2;
            if((i%2)==0){
                pi=pi+(4.0/totalDen);
            }
            else
                pi=pi-(4.0/totalDen);

            System.out.println(pi);

        }

    }
}
