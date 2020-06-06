/**
 * Esta clase grafica las velas
 * @author(Jacobo )
 * @version(2020/05/25)
 */
import java.awt.Dimension;
import java.util.Date;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.date.DateUtilities;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import java.util.ArrayList;
public class Candles extends ApplicationFrame
{
    private static final long serialVersionUID = 1L;
    private ArrayList<Vela> velas;
    public Candles(String s, ArrayList<Vela> velas) {
        super(s);
        this.velas=velas;
        JPanel jpanel = createDemoPanel();
        jpanel.setPreferredSize(new Dimension(540, 300)
        );
        setContentPane(jpanel);
    }

    private JFreeChart createChart(OHLCDataset ohlcdataset) {
        JFreeChart jfreechart = ChartFactory.createCandlestickChart("Velas Japonesas", "Time", "Value",
                ohlcdataset, true);
        XYPlot xyplot = (XYPlot) jfreechart.getPlot();
        NumberAxis numberaxis = (NumberAxis) xyplot.getRangeAxis();
        numberaxis.setAutoRangeIncludesZero(false);
        numberaxis.setUpperMargin(0.0D);
        numberaxis.setLowerMargin(0.0D);
        return jfreechart;
    }

    private OHLCDataset createDataset() {
        int n=velas.size();
        Date[] Fecha = new Date[n];
        double[] Maximo,Minimo,Inicial,Final,ad4;
        Maximo=new double[n];
        Minimo=new double[n];
        Inicial=new double[n];
        Final=new double[n];
        ad4=new double[n];
        int anio,mes,dia,pos=0,hh,mm;
        for(Vela v:velas){
            anio=v.Fecha/10000;
            mes=(v.Fecha/100)%100;
            dia=v.Fecha%100;
            hh=v.Hora/10000;
            mm=(v.Hora/100)%100;
            Fecha[pos]=DateUtilities.createDate(anio, mes, dia, hh, mm);
            Maximo[pos]=v.Maximo;   // high
            Minimo[pos]=v.Minimo;  // low
            Inicial[pos]=v.Inicial;  // open
            Final[pos]=v.Final;  // close
            ad4[pos]=0.0;
            pos++;
        }
        return new DefaultHighLowDataset("Velas imaginarias", Fecha, Maximo, Minimo, Inicial, Final, ad4);
    }

    private JPanel createDemoPanel() { 
        JFreeChart jfreechart = createChart(createDataset());
        return new ChartPanel(jfreechart);
    }

    public void mostrar(){
        this.pack();
        RefineryUtilities.centerFrameOnScreen(this);
        this.setVisible(true);
        
    }
}

