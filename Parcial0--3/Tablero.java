
import java.util.Scanner;
public class Tablero {

    
    int nf;
    int nc;
    
    public Tablero(int nf, int nc) {
        this.nf=nf;
        this.nc=nc;
        int Tablero[][]=new int[nf][nc];
        int arr[]=new int[nf*nc];
        for(int i = 0; i < nf ; i++){
           for(int j = 0; i<nc ; j++)
              Tablero[i][j] = new tablero();
        
        }
       
    }

      public void registarEntrada(int f, int c) {
      
        for(int i=0;i<arr.length;i++){
          
        }
     }

    public int obtFilas(int f) {
        return f;
    }

    public double obtPromedioFila(int f) {
        
        return f;
    }
}
