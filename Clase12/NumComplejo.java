
/**
 * Write a description of class NumComplejo here.
 * 
 * @author (Jacobo Rave L) 
 * @version (2020/03/4)
 */
public class NumComplejo
{
    private double img;
    private double real;

     

    public NumComplejo(){
        // this.real=0.0;
        //this.img=0.0;
        this(0.0,0.0);
    }

    public NumComplejo(double real){
        //this.real=real;
        //this.img=0.0;
        this(real,0.0);
    }

    public NumComplejo(double real, double img){
        this.real=real;
        this.img=img;
    }

    public void estImg(double i){
        this.img=i;
    }

    public void estReal(double r){
        this.real=r;
    }

    public double obtReal(){
        return this.real;
    }

    public double obtImg(){
        return this.img;
    }

    public boolean sonIguales(NumComplejo nc){
        if(real==nc.obtReal())
            if(img==nc.obtImg()){
                return true;            
            }
            else{ 
                return false;}
        else{

            return false;
        }        
        //return real==nc.obtReal() && img==nc.obtImg();
    }

    public NumComplejo sumar(NumComplejo nc){

        return new NumComplejo(real+nc.real, img+nc.img);

    }
    
    public NumComplejo escalar(double razon){
      return new NumComplejo()
    }
    
    public NumComplejo multiplicación(NumComplejo nc){
      return new NumComplejo(real*img-)  
    }
}
