/**
 * Write a description of class EjecutarCifraDelCesar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class EjecutarCifraDelCesar {

    private static char codificar(AsciiUtilidad au, Codificador cod, char c) {
	return au.deIntAAscii(cod.codificar(au.deAsciiAInt(c)));
    }

    private static char decodificar(AsciiUtilidad au, Decodificador dec, char c) {
	return au.deIntAAscii(dec.decodificar(au.deAsciiAInt(c)));
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int tipo = scan.nextInt();
	int desp = scan.nextInt();
	final int NCARINGLES = 26;

	scan.nextLine();
	String  linea = scan.nextLine();
	AsciiUtilidad au = new AsciiUtilidad();
	switch(tipo) {
	case 0:
	    {
		Codificador cod = new Codificador(desp,
						  NCARINGLES);
		for (int i = 0; i < linea.length(); i++)
		    System.out.print(codificar(au, cod, linea.charAt(i)));
		System.out.println();
	    }
	    break;
	case 1:
	    {
		Decodificador cod = new Decodificador(desp,
						      NCARINGLES);
		for (int i = 0; i < linea.length(); i++)
		    System.out.print(decodificar(au, cod, linea.charAt(i)));
		System.out.println();
	    }
	    break;
	}
    }
}
