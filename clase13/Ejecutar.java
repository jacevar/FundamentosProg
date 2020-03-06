
/**
 * Write a description of class Ejecutar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejecutar
{
    public static void main(String args[]){
    
    NumComplejo nc1= new NumComplejo(2,3);
    NumComplejo nc2= new NumComplejo(9,6);
    NumComplejo nc3= new NumComplejo(9,5);
    NumComplejo nc4= nc1.multiplicar(nc2).escalar(3).sumar(nc3);
    NumComplejo nc5= nc1.multiplicar(nc2).escalar(0.5).sumar(nc3);
    
    System.out.println("nc4 real: "+nc4.obtReal()+"img: "+nc4.obtImg());
    System.out.println("nc5 real: "+nc5.obtReal()+"img: "+nc5.obtImg());
    }
}
