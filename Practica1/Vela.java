
public class Vela
{
    int Fecha, Hora, Volumen;
    double Inicial, Final, Maximo, Minimo, Extension, Tamanio,mechaSuperior,mechaInferior;
    String Color;

    public Vela(String Color, int Fecha, int Hora, double Maximo, double Minimo, double Inicial, double Final, int Volumen){
        this.Color=Color;
        this.Fecha=Fecha;
        this.Hora=Hora;
        this.Maximo=Maximo;
        this.Minimo=Minimo;
        this.Inicial=Inicial;
        this.Final=Final;
        this.Volumen=Volumen;
        this.mechaSuperior=Math.abs(Final-Maximo);
        this.mechaInferior=Math.abs(Final-Minimo);
        this.Tamanio=Maximo-Minimo;
        this.Extension=Final-Inicial;
    }
    
    public String getVela(){
        return Color+" "+Fecha+" "+Hora+" "+Maximo+" "+Minimo+" "+Inicial+" "+Final+" "+Volumen;
    }
}

