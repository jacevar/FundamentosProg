public class ComprArreglo {
    public static int comprArreglo(double arreglo[]) {
    }

    public static void imprArreglo(double arreglo[], int n) {
	System.out.print("[");
	for (int i = 0; i < n; i++) {
	    System.out.print(arreglo[i]);
	    if ((i + 1) < n)
		System.out.print(",");
	}
	System.out.println("]");
    }

    public static void main(String[] args) {
	double arreglo[] = { 1.23, 1.23, 12.34, 12.34, 12.34, 23.23, 1.23, 1.23 };
	imprArreglo(arreglo, arreglo.length);
	int tam = comprArreglo(arreglo);
	imprArreglo(arreglo, tam);
    }
}
