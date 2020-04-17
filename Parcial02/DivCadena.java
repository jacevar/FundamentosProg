
public class DivCadena {

    private static String inicio;
    private static String fin;
    private static String medio;

    public DivCadena(String cadena) {
       int promedio = cadena.length()/2;
       
       if(cadena.length() % 2==0){
        
        inicio=cadena.substring(0,promedio);
        medio="";
        fin=cadena.substring(promedio,cadena.length());
        
        
        
        }
        else{
        inicio= cadena.substring(0,promedio);
        medio= cadena.substring(promedio,promedio+1);
        fin= cadena.substring(promedio+1,cadena.length());
        
        
        
        }
       
       
       
       
       
    }

    public String obtInicio() {
        return inicio;
    }

    public String obtMedio() {
       return medio;
    }
    
    public String obtFin() {
       return fin;
    }
}


