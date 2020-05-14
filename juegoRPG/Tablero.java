
/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class Tablero
{
    Scanner scan=new Scanner(System.in);
    static Monstruo o1;
    static jugador j1;
    static Object tablero[][];
    static Random random = new Random((int) System.nanoTime());

    int dado=0;
    public void juego(){

    }

    public int dado(){
        Random random = new Random((int) System.nanoTime());
        int dado=random.nextInt(6)+1;

        return dado;
    }

    public void Tablero(){
        int i=0;
        int j=0;
        int a=dado=random.nextInt(2)+1;;

        if(a == 1){
            dado=random.nextInt(2)+1;
            tablero[i][j]=new jugador("juan",10,"");}
        else if(a == 2){

            tablero[i][j]=new Orco("Orcaton",3,"Grrr");   

        }else
            tablero[i][j]=new String("");
    }

    public void Menu(){

        System.out.println("1.Juego   2) Salir a menu");

        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        if(a==1){

            jugar();
        }else if(a==2){}

        else
            Menu();
    }

    public void jugar(){
        Scanner in = new Scanner(System.in);
        jugador a=new jugador("juan",10,"");
        int x,y;
        System.out.println("entre eje X y Y respectivamente");  

        x=in.nextInt();

        y=in.nextInt();
        if(x<5 && x>=0 && y<5  && y>=0)
            mover(x,y);
        else
            System.out.println("Fuera de rango!!");
            
            
        while(j1.vidas()>0){
            System.out.println("entre eje X y Y respectivamente");  

            x=in.nextInt();

            y=in.nextInt();
            if(x<5 && x>=0 && y<5  && y>=0)
                mover(x,y);
            else
                System.out.println("Fuera de rango!!");
        }
        
        
        if(j1.vidas()<=0){
            System.out.println("perdiste");
            
        }
    }

    public void mover(int x, int y){

        System.out.println("Hemos encontrado a un enemigo.\n ¡Inicia el ataque!");

        int turno = (int)(Math.random()*2)+1;
        if(turno == 1)
            j1.agregarArma_Y_Ataque(o1);
        else
            o1.atacar(j1);
        System.out.println("Vidas: "+j1.vidas());

    }
}
