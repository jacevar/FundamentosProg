

/**
 * EvaluarTablero
 *
 */
import java.util.Scanner;
public class EvaluarTablero {

    public static void main(String []args) {
	Scanner scan = new Scanner(System.in);

	int nf, nc;
	nf = scan.nextInt();
	nc = scan.nextInt();

	Tablero tablero = new Tablero(nf, nc);
	
	while (scan.hasNextInt()) {
	    int f, c;
	    f = scan.nextInt();
	    c = scan.nextInt();
	    tablero.registarEntrada(f,c);
	}

	for (int i = 0; i < tablero.obtFilas(); i++){
	    System.out.println("Fila: " + i +
			       " promedio: " +
			       tablero.obtPromedioFila(i));}
    }
}
