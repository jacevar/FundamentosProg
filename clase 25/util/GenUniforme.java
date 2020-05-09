package util;

import java.util.Random;
/**
 * Write a description of class GenUniforme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenUniforme
{
  private double min, max;
  private Random random;
  public GenUniforme(double min, double max){
    this.min=min;
    this.max=max;
    random = new Random(System.currentTimeMillis());  
    }
    
  public double obtSig(){
    return (Math.abs(random.nextDouble() % (max - min)))+min;
    
    
    
    }  
}








