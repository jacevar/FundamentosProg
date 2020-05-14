
/**
 * Write a description of class NPC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPC extends Humano
{
    String Accion;
    
    public NPC(String Nombre, int Sangre, String Accion){
    super(Nombre,Sangre);
    this.Accion=Accion;
    
    }
    
    public void imprimirNombre(){
      System.out.println("Soy: " + Nombre);
    }
    
    public void decirHabilidad(){
      System.out.println("Vendo cosas como espadas y arcos");
    }
}
