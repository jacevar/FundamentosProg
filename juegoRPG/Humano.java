
/**
 * Write a description of class Humano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
public abstract class Humano
{    
    protected String Nombre;
    protected int vidas=100;
    protected String habilidad;
    protected String cosas;
    jugador j1;
    Orco o1;
    public Humano(String Nombre , int vidas){
        this.Nombre=Nombre;
        this.vidas=vidas;
    }
    
    public int vidas(){    
        return vidas;
    }   
    
    public void moverse(){
    }    
    
    public void atacarq(Monstruo m1){
        //j1.agregarArma();
        
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
        
        // daño=daño+dañoDaga;
        /*if(m1.Sangre()>daño)
        {
            daño=daño;
        }
        else{
            daño=m1.Sangre;
        }*/
       // int daño=20;
        //m1.bajarDaño(daño);
    }

    public void bajarDaño( int daño){
        vidas=vidas-daño;
    } 
    
    public void decirHabilidad(){
      
    }    
    
    

}
