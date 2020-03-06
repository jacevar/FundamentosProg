
/**
 * Write a description of class NumComplejo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumComplejo
{
    private double real;
    private double img;

    public double obtReal(){
        return real;
    }

    public double obtImg(){
        return img;
    }

    public void estReal(double r){

        real= r;
    }

    public void estImg(double i){

        img= i;
    }

    public NumComplejo(){
        this(0.0,0.0);   
    }

    public NumComplejo(double r){

        this(r,0.0);

    }

    public NumComplejo(double r, double i){
        real=r;
        img=i;
    }

    public boolean sonIguales(NumComplejo otro){

        return real==otro.real && img==otro.img;
    }

    public NumComplejo sumar(NumComplejo operder){
        return new NumComplejo(real+operder.real, img+operder.img);

    }

    
    public NumComplejo escalar(double r) {
        return new NumComplejo(real*r,img*r);   
    }
    
    public NumComplejo multiplicar(NumComplejo operder){
     
     //double img;
     //double real;
     //return null;
     double real = this.real*operder.real-this.img*operder.img;
     double img = this.real*operder.img +this.img*operder.real;
     
     return new NumComplejo(real,img);
    }
    
    public NumComplejo restar(NumComplejo operder){
    
    return new NumComplejo(real-operder.real,img-operder.img);
    }
    
    public NumComplejo dividir(NumComplejo operder){
    
     final double DOS=2.0;
     double dem = Math.pow(operder.real,DOS)+Math.pow(operder.img,DOS);
     double real= (this.real*operder.real+this.img*operder.img);
     
     real= real/dem;
     double img=(this.img*operder.real-this.real*operder.img);
     img= img/dem;
     return new NumComplejo(real,img);
    }
}
