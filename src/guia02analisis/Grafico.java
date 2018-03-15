
package guia02analisis;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
public class Grafico {
    public void gf1(){
        XYSeries series = new XYSeries("e^(x-1)-1.5x");
        for(int i=-10; i<=3; i++){
        series.add(i, (Math.exp(i-1)-1.5*i));
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Método gráfico","x","Y",dataset,
                PlotOrientation.VERTICAL,true,false,false);
        ChartFrame frame = new ChartFrame("Análisis Númerico", chart);
        frame.pack();
        frame.setVisible(true);
    }
    public void gf2(){
         XYSeries series = new XYSeries("2sen(x)-x");
        double i=-10;
        do{
        series.add(i, (2*Math.sin(i)-i));
        i=i+0.1;
        }while(i<=10);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
       
        JFreeChart chart = ChartFactory.createXYLineChart("Método gráfico", "x","Y",dataset,
                PlotOrientation.VERTICAL,true,false,false);
        ChartFrame frame = new ChartFrame("Análisis Númerico", chart);
        frame.pack();
        frame.setVisible(true);
    }
    public void gf3(){
        XYSeries series = new XYSeries("e^(x)-4");
        // Introduccion de datos
        for(int i=-10; i<=3; i++){
        series.add(i, (Math.exp(i)-4));
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Método gráfico","x","Y",dataset,
                PlotOrientation.VERTICAL,true,false,false);
        ChartFrame frame = new ChartFrame("Análisis Númerico", chart);
        frame.pack();
        frame.setVisible(true);
    }
    public void gf4(){
        XYSeries series = new XYSeries("e^-(x-1)*sen(x)-1");
        double i=-10;
        do{
        series.add(i, (Math.exp(-(i-1))*Math.sin(i)-1));
        i=i+0.1;
        }while(i<=3);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Método gráfico", "x","Y",dataset,
                PlotOrientation.VERTICAL,true,false,false);
        ChartFrame frame = new ChartFrame("Análisis Númerico", chart);
        frame.pack();
        frame.setVisible(true);
    }
    public void gf5(){
           XYSeries series = new XYSeries("4sen(x)-e^x");
        double i=-10;
        do{
        series.add(i, (4*Math.sin(i)-Math.exp(i)));
        i=i+0.1;
        }while(i<=3);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Método gráfico", "x","Y",dataset,
                PlotOrientation.VERTICAL,true,false,false);
        ChartFrame frame = new ChartFrame("Análisis Númerico", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
