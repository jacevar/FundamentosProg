
/**
 * Write a description of class Monstruo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
public abstract class Monstruo
{
    protected String Nombre;
    protected int Sangre=100;
    Orco o1;

    public Monstruo(String Nombre, int Sangre){        
        this.Nombre=Nombre;
        this.Sangre=Sangre;
    }    

    public int Sangre(){
        return Sangre;
    }    

    public void moverse(){
    }     
    
    public String obtNom(){
    return Nombre;
    }

    public void atacar(jugador j1){
        //o1.agregarGruñido();
        
        /*Random random = new Random((int) System.nanoTime());

        int daño=0;
        int temp=random.nextInt(6)+1;
        if(temp==1)
            daño=3;
        else if(temp==2)
            daño=6;
        else if(temp==3)
            daño=9;
        else if(temp==4)
            daño=12;
        else if(temp==5)
            daño=15;
        else if(temp==6)
            daño=18; 

        /*if(j1.vidas()>daño)
        {
            daño=daño;
        }
        else{
            daño=j1.vidas;
        }*/
        //int daño=20;
        //j1.bajarDaño(daño);
    }    

    public void bajarDaño(int daño){
        Sangre=Sangre-daño;
    } 
    
    public void decirMovimiento(){
      
    }    
}
