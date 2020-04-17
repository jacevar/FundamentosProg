import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ExecVentas {

    public static void ordenar(Ventas []ventas, int nVentas, int tr) {
    }

    public static int procesar(String fichero, Ventas []ventas) {
	Scanner scan = null;
	try {
	    scan = new Scanner(new File(fichero));
	} catch(FileNotFoundException fnfe) {
	    System.err.println("Esto no puede ocurrir, pregunte al profe...");
	    System.exit(1);
	}
	int nVentas = 0;

	while (scan.hasNextLine()) {
	    String linea = scan.nextLine();
	    Scanner strScan = new Scanner(linea);

	    int codigo = strScan.nextInt();
	    double tr1 = strScan.nextDouble();
	    double tr2 = strScan.nextDouble();
	    double tr3 = strScan.nextDouble();
	    double tr4 = strScan.nextDouble();
	    ventas[nVentas++] = new Ventas(codigo, tr1, tr2, tr3, tr4);
	}

	return nVentas;
    }

    public static void imprimir(Ventas[] ventas, int nv) {
    }

    public static void main(String []args) {
	Ventas ventas[] = new Ventas[1000];
	int nv = procesar("Ventas.txt", ventas);

	imprimir(ventas, nv);
	Scanner scan = new Scanner(System.in);

	while (scan.hasNextInt()) {
	    int tr = scan.nextInt() % 4;
	    ordenar(ventas, nv, tr);
	    imprimir(ventas, nv);
	}
    }
}
