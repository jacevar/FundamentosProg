
/**
 * Rectangulo.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/01/31)
 */
public class Rectangulo
{
 private double altura;
 private double base;
  
 public Rectangulo(double miBase, double miAltura){
    
  base=miBase;
  altura=miAltura;
  }
 
public double calcularArea(){

    return base * altura;
}




}
