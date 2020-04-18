public class ComprArreglo {
    static int i =0;
    static int init=1;
    static int PosIni=0,PosFin=0;
    static int j = 0;

    public static int compararArreglo(double arreglo[]) {
        
        for( i=0;i<arreglo.length-1 && PosIni<arreglo.length;i++){
            if(arreglo[i]==arreglo[PosIni+1]){

                for( j=PosIni+1; j<arreglo.length && arreglo[i]==arreglo[j]; j++){
                    PosFin=j; 

                }
                PosIni=PosFin+1;
                if(PosIni<arreglo.length){

                    arreglo[init]=arreglo[PosIni];
                    init++;

                }
            }
            else{
                PosIni++;
                arreglo[init]=arreglo[PosIni];
                init++;

            }   
            
        }

        return init;
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
        int tam = compararArreglo(arreglo);
        imprArreglo(arreglo, tam);
    }
}

   
     
     
