
/**
 * Esta clase calcula la pendiente de los indicadores .
 *
 * @author (Jacobo Rave L)
 * @version (2020/06/04)
 */
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class RegresionLineal extends SerieIndicador {
    private double[] x;
    private double[] y;    //número de datos
    public double a, b;    //pendiente y ordenada en el origen
    /**
     *El Constructor RegresionLineal inicializa los valores de X y Y  
     * 
     *@param cv
     *@param n
     */
    public RegresionLineal(ColeccionVelas cv,int n){
      // 4 3 6 7 8 10 4 5
      super(cv,n);
      this.x=new double[cv.velas.size()];
      this.y=new double[cv.velas.size()];
      this.n=n;
      guardarValoresDeLosArreglos();
      calcularValoresDeRegresion();
    }

    /**
     * 
     * El método guardarValoresDeLosArreglos permite asignar el tamaño del x con el tamaño de las velas y el Y con el valor precioFinal de cada vela
     * 
     */
    public void guardarValoresDeLosArreglos(){
      for(int i=0;i<cv.velas.size();i++){
        x[i]=i;
        y[i]=cv.velas.get(i).Final;
      }
    }

    
    /**
     * 
     * El método lineal arranca con la posicion inicial y cuantas vlas  se usan para calcular la pendiente 
     *@param inicio 
     *@param m
     */
    public double lineal(int inicio, int m){
        double pxy, sx, sy, sx2, sy2;
        pxy=sx=sy=sx2=sy2=0.0;
        for(int i=inicio; i<inicio+m; i++){
            sx+=x[i];
            sy+=y[i];
            sx2+=x[i]*x[i];
            sy2+=y[i]*y[i];
            pxy+=x[i]*y[i];
        }
        b=(n*pxy-sx*sy)/(n*sx2-sx*sx);
        a=(sy-b*sx)/n;
        return b;
    }

     /**
     * El método calcularValoresDeRegresion calcula el pendiente de n velas que el usuario necesite calcular
     * 
     */
    public void calcularValoresDeRegresion(){
       for(int i=0;i< cv.velas.size();i++){
          int fecha = cv.velas.get(i).Fecha;
          int hora = cv.velas.get(i).Hora;
          if(i<(n-1)){
              Indicador ind= new Indicador(fecha,hora,null);
              indicador.add(ind);
          }else{
            double pendiente = lineal(i-n+1,n);
            Indicador ind= new Indicador(fecha,hora,pendiente);
            indicador.add(ind);
          }

       }
    }


}
