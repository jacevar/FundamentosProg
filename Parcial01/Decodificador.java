/**
 * Write a description of class Decodificador here.
 *
 * @author (Jacobo Rave Londoño)
 * @version (2020/02/28)
 */
public class Decodificador {
    private int desp;
    private int n;
    
    public Decodificador(int desplazamiento, int nCar) {
        this.desp=desplazamiento;
        this.n=nCar;
    }

    public int decodificar(int x) {
        int de = (x-desp)%26;
        
        return de;
    }
}
