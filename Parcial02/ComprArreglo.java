
public class ComprArreglo
{
    static double a=0;
    static int cont=0;
    static int b=0;
    static boolean encontrado=false;
    static int i=0;
    public static int comprArreglo(double arreglo[]) {
        for(int j =0;j<arreglo.length-1;j++){
            if(arreglo[j]==arreglo[j+1]){
                
                cont++;
                a=arreglo[j];
            }  

        }
        double arr[]=new double[cont];

        for(int k=0;k<arr.length;k++){
            arr[k]=a;

        }

        imprArreglo(arr, a);
        
     }
    public static void imprArreglo(double arr[], double a) {
        System.out.print("[");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i]);
            if ((i + 1) < a)
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
}
