
/**
 * Write a description of class Dragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Dragon extends Monstruo
{
   String escamas;
   piel p1;
   
   ArrayList<piel> arreglod;
   public Dragon(String Nombre,int Sangre, String escamas){
    super(Nombre, Sangre);
    this.escamas=escamas;
    
    arreglod = new ArrayList<>();
    arreglod.add(new metal(0,"rojo","filo convexo"));
    arreglod.add(new metal(0,"gris","filo convexo"));
    }
    
    public void imprimirNombre(){
     System.out.println("Mi nombre es: " + Nombre);
    }
    
    public String obtNom(){
    return Nombre;
    }
    
    public void moverse(){
        System.out.println("Soy un Dragon, estoy volando");
    }
    
    int DañoPiel=0;
    public void agregarPiel_Y_Ataque(jugador j1){
        int piel;
        Scanner scan=new Scanner(System.in);
        System.out.println("agrega tu arma: 1:arco, 2:daga");
        piel=scan.nextInt();

        if (piel==1){
         System.out.println("daño piel");  
         DañoPiel=scan.nextInt();
         System.out.println("color");
         String color=scan.nextLine();
         System.out.println("FiloPiel");
         String filoPiel=scan.nextLine();
         arreglod.add(new metal(DañoPiel,color,filoPiel));
        }
        
        else if(piel==2){
         System.out.println("daño piel");  
         DañoPiel=scan.nextInt();
         System.out.println("color");
         String color=scan.nextLine();
         System.out.println("FiloPiel");
         String filoPiel=scan.nextLine();
         arreglod.add(new cuero(DañoPiel,color,filoPiel));

        }
        
        
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
        
        daño=daño+DañoPiel;
        
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
