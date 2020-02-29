/**
 * Write a description of class Codificador here.
 *
 * @author (Jacobo Rave Londoño)
 * @version (2020/02/28)
 */
public class Codificador {
    private int desp;
    private int n;
    
    public Codificador(int desplazamiento, int nCar) {
        this.desp=desplazamiento;
        this.n=nCar;
    }

    public int codificar(int x) {
       int cod= (x+desp)%26;
       
       return cod;
    }
}
