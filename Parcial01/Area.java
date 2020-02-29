/**
 * Write a description of class Area here.
 *
 * @author (Jacobo Rave Londoño)
 * @version (2020/02/28)
 */
public class Area {

    private float xInf;
    private float yInf;
    private float xSup;
    private float ySup;
    private int golpes;
    
    public Area(float x1, float y1, float x2, float y2) {
        xInf=x1;
        ySup=y1;
        xSup=x2;
        yInf=y2;
        
    }

    public void golpear(float x, float y) {
        if((x>=xInf)&&(x<=xSup)){
            if(y>=ySup && y<=yInf){
                golpes++;
            }

        }
        
    }

    public int obtTotalGolpes() {
        return golpes;
    }

}
