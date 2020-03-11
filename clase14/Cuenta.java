
/**
 * Cuenta representa un cuento de banco simple sin interes.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/03/11)
 */
public class Cuenta
{
    private int nroCuenta;
    private double saldo;   
    public static int secuencia;
    public final static int Min_Secuencia=100;
    
    
    static{
    secuencia=Min_Secuencia;
    
    }
    
    public Cuenta(double saldo){
    
    }
    
    public Cuenta(){
     nroCuenta=secuencia++;
    }
    
    public static int obtSecuencia(){
     //System.out.print(nroCuenta);
     return secuencia;
    
    }
    
    public static void imprimirNroCuenta(int nroEspacios , Cuenta cuenta)
    {
       for(int i=0;i<nroEspacios; i++){
       System.out.print(' ') ;
      
    }
    System.out.println(cuenta.nroCuenta);
    /*public static void retirar(double valor){
    
    }
    
    public void consignar(double valor){
    
    }
    
    public int sisSecuencia(){
    
    
    } 
    */
    
    
    
}
}