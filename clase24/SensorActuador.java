
/**
 * Write a description of class SensorActuador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
public class SensorActuador
{
    private int tempActual;
    
    public SensorActuador(int tempActual){
     this.tempActual=tempActual;
    }

    public int obtTempActual(){
    
     Random random = new Random((int) System.nanoTime());
     
     tempActual +=random.nextInt(3)-1;
     return tempActual;
    }
}