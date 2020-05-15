import java.util.Scanner;

public class EjecutarElementos {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	Elemento elemento = new Elemento(scan.nextInt());

	while (scan.hasNextInt())
	    elemento = new Elemento(scan.nextInt(), elemento);

	System.out.println(elemento.obtLongitud());
    }
    
    
}
