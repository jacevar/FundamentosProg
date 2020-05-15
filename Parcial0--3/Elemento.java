
public class Elemento {
    int valor;
    Elemento siguiente;
    public Elemento(int valor) {
        this.valor=valor;
    }

    public Elemento(int valor, Elemento siguiente) {
        this.valor=valor;
        this.siguiente=siguiente;
    }

    public Elemento obtSiguiente(){
        return  siguiente;
    }

    public int obtValor() {
        return valor;
    }

    public int obtLongitud() {

        if(siguiente!=null){

            return obtSiguiente().obtLongitud()+1;
        }
        else
            return 1;}

}

