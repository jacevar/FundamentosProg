
/**
 * Calcula x a la n.
 * 
 * @author (Jacobo Rave Londoño) 
 * @version (2020/04/22)
 */
public class potencia
{
    public static int potencia(int x, int n){

        if(n==0){
            return 1;}

        return x * potencia(x, n-1);

    }
}
