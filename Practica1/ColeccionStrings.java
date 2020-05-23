 
/**
 * Esta clase es un ejemplo de rompimiento de control.
 *
 * @author Helmuth Trefft
 * @version Mayo de 2020
 */
import java.util.ArrayList;

public class ColeccionStrings extends ArrayList<String>
{
    /**
     * Este método cuenta cuántos strings hay de cada clase.
     */
    public void contar() {
        int n = this.size();
        if(n == 0) return;

        int cont = 0;
        int i = 0;
        boolean firstTime = true;
        String anterior = "";
        while(i < n) {
            String actual = get(i); i++; cont++;    // leer un dato
            if(firstTime) { // Inicializar velita
                anterior = actual;
                firstTime = false;
            } else {
                if(actual.equals(anterior)) {
                    // si hay que hacer algo, ponerlo aquí
                    // actualizar velita
                } else  {   // rompimiento de control
                    // agregar velta anterior al ArrayList
                    System.out.println(anterior + " " + (cont-1));
                    // inicializar una nueva velita
                    cont = 1;
                    anterior = actual;
                } 
            }
        }
        // guardar los datos de la vela anterio
        System.out.println(anterior + " " + cont);
    }

    public static void main() {
        ColeccionStrings cs = new ColeccionStrings();
        cs.add("a");
        cs.add("a");
        //cs.contar();
        //System.out.println("===");
        cs.add("b");
        cs.add("b");
        cs.add("b");
        cs.add("c");
        cs.add("c");
        cs.add("c");
        cs.add("c");
        cs.contar();
        System.out.println("===");
    }
}
