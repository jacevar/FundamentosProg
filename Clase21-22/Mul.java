
/**
 * Write a description of class Mul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mul
{
    public static int multEnt(int a,int b){
    
    if(b==0)
    {return 0;}
    return a + multEnt(a,b-1);
    
    }
}
