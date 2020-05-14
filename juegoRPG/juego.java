
/**
 * Write a description of class juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class juego
{
    Monstruo m1;  
    Humano h1;
    Scanner scan = new Scanner(System.in);
    //Monstruo [] arr;
    //Orco orco1 = new Orco("hola",15,"grf");
    ArrayList<Monstruo> arr;    
    ArrayList<Humano> arre;
    
     public static void main(String args[]){
     Tablero tablero=new Tablero();
         tablero.Menu();
         
     }
    
   
    public void asignarMonstruo(Monstruo m1){
        this.m1=m1;    
    }    

    public void asignarPersonaje(Humano h1){
        this.h1=h1;    
    }
    
    public juego(){
        arr = new ArrayList<>();
        arr.add(new Orco("Garnag",10,"garr"));
        arr.add(new Dragon("Brenton",20,"metal"));
        arr.add(new Orco("Rogthun",5,"purr"));
        arr.add(new Dragon("Draco",40,"cuero"));

        arre = new ArrayList<>();
        arre.add(new jugador("Christopher",10,"ataque largo con arco"));
        arre.add(new NPC("Marcos",0,"vender espadas"));
        arre.add(new jugador("Lion",5,"ataque corto con daga"));
        arre.add(new NPC("humberto",0,"vender trabucos"));
    }

    public void agregarMonstruo(Monstruo m){
        arr.add(m);
    }

    public void agregarJugador(jugador h){
        arre.add(h);
    }

    public void moverMonstruos(){
        for(Monstruo m: arr){
            m.moverse();
        }

    }

    public void atacarHumanos(){
        for(Humano h: arre){
            h.decirHabilidad();
        }

    }
    /*
    public juego(){

    arr = new Monstruo[4];
    arr[0] = new Orco("Garnag",10,"garr");
    arr[1] = new Dragon("Brenton",20,"metal");
    arr[2] = new Orco("Rogthun",5,"purr");
    arr[3] = new Dragon("Draco",40,"cuero");   

    } 

    public void moverMonstruos(){
    for(int i = 0 ; i < arr.length; i++) {
    arr[i].moverse();
    }
    }*/

}
