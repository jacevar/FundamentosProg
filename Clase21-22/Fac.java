
/**
 * Write a description of class Fac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fac
{
   public static int Factorial(int n){
    
   if(n==0||n==1)
    {return n;}
    return n*Factorial(n-1);
    
     //return(n==0)?1:n*Factorial(n-1); 
    
    
    }
}
