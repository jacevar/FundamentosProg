
/**
 * Write a description of class Arco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Arco extends Arma
{

    String alcance;
    int daño=0;
    public Arco(String nombre, int daño,String alcance){

        super(nombre,daño);
        this.alcance=alcance;

    }
    public void atacar(Monstruo m1){
        
    }
}