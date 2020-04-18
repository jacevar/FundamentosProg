

public class Ventas {
    int codigo;
    double ventas[]=new double[4];
    
    public Ventas(int codigo, double tr1, double tr2, double tr3, double tr4) {
        //recibe codigo y venta de 4 trimestres
        this.codigo=codigo;
        //double ventas[]={tr1,tr2,tr3,tr4}; no me sirvio esta declaracion :(
        ventas[0] =tr1;
        ventas[1] =tr2;
        ventas[2] =tr3;
        ventas[3] =tr4;
    }

    public int obtCodigo() {
        return codigo;
    }

    public double obtVentas(int tr) {
        return ventas[tr];
    }

     public String toString() {
        return  codigo+""+" "+ventas[0]+" "+ventas[1]+" "+ventas[2]+" "+ventas[3];
        
    }
}
