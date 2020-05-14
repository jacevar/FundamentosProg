
/**
 * Write a description of class jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class jugador extends Humano
{
    String tipoAtaque;
    Arma a1;
    Orco o1;
    Dragon d1;
    ArrayList<Arma> arreg;

    public jugador(String Nombre, int vidas, String tipoAtaque){
        super(Nombre,vidas);
        this.tipoAtaque=tipoAtaque;

        arreg = new ArrayList<>();
        arreg.add(new daga("estilete ingles",56,"filo convexo"));
        arreg.add(new Arco("Arco huno",92,"150"));
        arreg.add(new daga("daga de romaña",68,"filo doble"));
        arreg.add(new Arco("Arco asirio",50,"150"));
        arreg.add(new Puño("Gigante",0,"20"));
    }

    public void imprimirNombre(String Nombre){
        System.out.println("Soy: " + Nombre);
    }
    
    public String obtNom(){
    return Nombre;
    }

    public void decirHabilidad(){
        System.out.println("Tengo una habilidad y es matar monstruos");

    }

     int dañoDaga=0;
     int DañoArco=0;
     int dañoPuño=0;
     
    public void agregarArma_Y_Ataque(Monstruo o1){
        int miArma;
        Scanner scan=new Scanner(System.in);
        System.out.println("agrega tu arma: 1:arco, 2:daga, 3:Puño");
        miArma=scan.nextInt();

        if(miArma==1){
            System.out.println("nombre arco");
            scan.nextLine();
              String nomArco=scan.nextLine();
            System.out.println("daño");  
              DañoArco=scan.nextInt();
              
            System.out.println("alcance");
            scan.nextInt();
              String definirAlcance=scan.nextLine();
            arreg.add(new Arco(nomArco,DañoArco,definirAlcance));
        }
        else if(miArma==2){
            System.out.println("nombre daga");
            scan.nextLine();
              String nomDaga=scan.nextLine();
            System.out.println("daño");  
              dañoDaga=scan.nextInt();
            System.out.println("filo");
              scan.nextLine();
              String definirFilo=scan.nextLine();
            arreg.add(new daga(nomDaga,dañoDaga,definirFilo));

        }else if(miArma==3){
            System.out.println("nombre Puño");
            scan.nextLine();
              String nomPuño=scan.nextLine();
            System.out.println("Peso");
              scan.nextLine();
              String definirPuño=scan.nextLine();
            arreg.add(new daga(nomPuño,dañoPuño,definirPuño));
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
        
        daño=daño+dañoDaga;
        daño=daño+DañoArco;
        int san= o1.Sangre();
        if(san>daño)
        {
            daño=daño;
        }
        else{
            daño=o1.Sangre;
        }
       o1.bajarDaño(daño);
    }
    
    public int obtVida(){
    return vidas;
    }
}
