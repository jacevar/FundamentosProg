
/**
 * Lee rectangulo e improime el area.
 * 
 * @author (Jacobo Rave) 
 * @version (2020/01/31)
 */
import java.util.*;

public class LecRec
{
    
    public static void main(String args[]) {
    
    Scanner scan=new Scanner(System.in);
    double laBase, laAltura;
    
    System.out.println("Entre la base y la altura separada por espacios");
    
    laBase = scan.nextDouble();
    laAltura = scan.nextDouble();
    
    
    //Declara
    //paso1
    Rectangulo rec1=new Rectangulo (laBase, laAltura);
    
    rec1 = new Rectangulo(laAltura, laBase);
    
    
   //Rectangulo rec2= rec1;
    
    System.out.print("El area es:");
    System.out.println(rec1.calcularArea());
    
    
    
    }
}
