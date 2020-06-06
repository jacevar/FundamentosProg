
/**
 * Write a description of class PromedioMovil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
/**
* Este codigo lo donó Helmuth
*/
public class PromedioMovil extends SerieIndicador {
    private double[] x;
    private double[] y;    //número de datos
    public double a, b;    //pendiente y ordenada en el origen
    /**
     * El constructor padre inicializa los valores y se le asigna el tamaño a lass X y Y que son la cantidad de velas pasadas
     * y el n que es la longitud que requiere la regresion
     * @param cv
     * @param n
     */
    public PromedioMovil(ColeccionVelas cv,int n){
      // 4 3 6 7 8 10 4 5
      super(cv,n);
      this.x=new double[cv.velas.size()];
      this.y=new double[cv.velas.size()];
      this.n=n;
      guardarValoresDeLosArreglos();
      calcularValoresPromedio();
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
     * El método promedio calcula el promedio de una vela inicial y una que se designa
     * 
     * @param inicio la vela donde empieza la regresion
     * @param m cantidad de velas que se tiene en cuenta
     * @return promedio 
     */
    public double promedio(int inicio, int m){
        double suma=0;
        for(int i=inicio;i<inicio+m;i++){
          suma+=y[i];
        }
        return suma/n;
    }
 
    /**
     * El método calcularValoresPromedio calcula el promedio de n velas que el usuario necesite calcular
     * 
     */
    public void calcularValoresPromedio(){
       for(int i=0;i< cv.velas.size();i++){
          int fecha = cv.velas.get(i).Fecha;
          int hora = cv.velas.get(i).Hora;
          if(i<(n-1)){
              Indicador ind = new Indicador(fecha,hora,null);
              indicador.add(ind);
          }else{
            double promedio = promedio(i-n+1,n);
            Indicador ind= new Indicador(fecha,hora,promedio);
            indicador.add(ind);
          }

       }
    }


}
