/**
 * ExecDivCadena ejecuta un programa
 *
 */
public class ExecDivCadena {

    public static boolean verResultado(DivCadena dc, String res[]) {
	return dc.obtInicio().compareTo(res[0]) == 0 &&
	    dc.obtMedio().compareTo(res[1]) == 0 &&
	    dc.obtFin().compareTo(res[2]) == 0;
    }

    public static void prueba01() {
	String cadenas[] = { "uno", "tres", "cuatro", "cinco" };
	String resExperados[][]  = { { "u", "n", "o" },
				     { "tr", "", "es" },
				     { "cua", "", "tro" },
				     { "ci", "n", "co" }
	};

	for (int i = 0; i < cadenas.length; i++) {
	    DivCadena div = new DivCadena(cadenas[i]);
	    System.out.println("Prueba: " + i +
			       " res: " + verResultado(div, resExperados[i]));
	}
    }

    public static void main(String args[]) {
	prueba01();
    }
}
