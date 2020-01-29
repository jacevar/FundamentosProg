
/**
 * Contador es una clase que cuenta y muestra el valor actual del contador.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/01/29)
 */

public class Contador
{
  //Atributos  
  private int conteo; //variable de conteo
  
  //constructor
  public Contador(int inicial){
      conteo = inicial;
    }
  //metodo(setter)
  //metod mutante
  public void incrementar(){
       conteo++;
    }
  //método(getter)
  public int obtContador(){
     return conteo;
      
    
    }
}
