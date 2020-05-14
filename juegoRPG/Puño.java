
/**
 * Write a description of class Puño here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Puño extends Arma
{

    String Peso;
    int daño=0;
    public Puño(String nombre, int daño,String Peso){

        super(nombre,daño);
        this.Peso=Peso;

    }
    public void atacar(Monstruo m1){
        
    }
}
