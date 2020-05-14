
/**
 * Write a description of class Orco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Orco extends Monstruo
{
    String Gruñido;
    gruñido g1;
    ArrayList<gruñido> arreglo;
   
    public Orco(String Nombre, int Sangre, String Gruñido){
        super(Nombre,Sangre);
        this.Gruñido = Gruñido;
        
        arreglo = new ArrayList<>();
        arreglo.add(new guuaa(0,"sur","grave"));
        arreglo.add(new bee(0,"norte","agudo"));
        arreglo.add(new buuhh(0,"occidente","medio"));
        
    }
    
    public void imprimirNombre(){
    System.out.println("Mi nombre es: " + Nombre);
    }
    
    public String obtNom(){
    return "orco: "+super.obtNom();
    }

    public void moverse(){
    System.out.println("Soy un orco, estoy corriendo");
    }
    
    int DañoGruñido=0;
    public void agregarGruñido_Y_Ataque(jugador j1){
        int Gruñido;
        Scanner scan=new Scanner(System.in);
        System.out.println("elegir gruñido: 1:bee, 2:guuaa, 3:buuhh");
        Gruñido=scan.nextInt();
       
        if(Gruñido==1){
            
            System.out.println("daño");  
              DañoGruñido=scan.nextInt();
            System.out.println("latitud");
            scan.nextLine();
              String latitud=scan.nextLine();
              System.out.println("color");
              scan.nextLine();
              String color=scan.nextLine();
            arreglo.add(new bee(DañoGruñido,latitud,color));
        }
        else if(Gruñido==2){
             System.out.println("daño");  
              DañoGruñido=scan.nextInt();
            System.out.println("latitud");
            scan.nextLine();
              String latitud=scan.nextLine();
              System.out.println("color");
              scan.nextLine();
              String color=scan.nextLine();
            arreglo.add(new guuaa(DañoGruñido,latitud,color));

        }else if(Gruñido==3){
            System.out.println("daño");  
              DañoGruñido=scan.nextInt();
            System.out.println("latitud");
            scan.nextLine();
              String latitud=scan.nextLine();
              System.out.println("color");
              scan.nextLine();
              String color=scan.nextLine();
            arreglo.add(new buuhh(DañoGruñido,latitud,color));
        }
        
        //System.out.print(dañoDaga);
        
        Random random = new Random((int) System.nanoTime());
        
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
        
        daño=daño+DañoGruñido;
        
        if(j1.vidas()>daño)
        {
            daño=daño;
        }
        else{
            daño=j1.vidas;
        }
       j1.bajarDaño(daño);
       
    }
    
    public int obtSangre(){
    return Sangre;
    }
    
}
