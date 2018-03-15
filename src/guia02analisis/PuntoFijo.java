
package guia02analisis;

import javax.swing.table.DefaultTableModel;

public class PuntoFijo {
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"iteracion","Xi","G(x)","Ea%"}, 0);
    public  DefaultTableModel PF1(){
        int cifS=7;
        double  nivTolerancia, error=100,x=0,Gx=0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        int ite=0;
        while (Math.abs(error) > nivTolerancia) {
            Gx=Math.exp(x-1)/1.5;
            error=(Gx-x)/Gx*100;
            x=Gx;
            ite++;
          modelo.addRow(new Object[]{ite,(Metodos.redondearDecimales(x, cifS)),(Metodos.redondearDecimales(Gx, cifS)),Metodos.redondearDecimales(error, cifS)});
         }
         return modelo;
    }
    public  DefaultTableModel PF2(){
          int cifS = 3;
        double nivTolerancia, error = 100;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        double x = -2.3562, Gx = 0;
        int ite = 0;
        while (Math.abs(error) > nivTolerancia) {
            Gx = 2*Math.sin(x);
            error = (Gx - x) / Gx * 100;
            x = Gx;
            ite++;
          modelo.addRow(new Object[]{ite,(Metodos.redondearDecimales(x, cifS)),(Metodos.redondearDecimales(Gx, cifS)),Metodos.redondearDecimales(error, cifS)});
         }
         return modelo;
    }
    public  DefaultTableModel PF3(){
      int cifS=4;
        double  nivTolerancia, error=100,x=0,Gx=0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        int ite=0;
        while (Math.abs(error) > nivTolerancia) {
            Gx=Math.exp(x-1)/1.5;
            error=(Gx-x)/Gx*100;
            x=Gx;
            ite++;
          modelo.addRow(new Object[]{ite,(Metodos.redondearDecimales(x, cifS)),(Metodos.redondearDecimales(Gx, cifS)),Metodos.redondearDecimales(error, cifS)});
         }
         return modelo;
    }
    public  DefaultTableModel PF4(){
       int cifS=3;
        double  nivTolerancia, error=100,x=-0.5,Gx=0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        int ite=0;
         while (Math.abs(error) > nivTolerancia) {
            Gx = Math.asin(1/Math.exp(-(x-1)));
            error = (Gx - x) / Gx * 100;
            x = Gx;
            ite++;
          modelo.addRow(new Object[]{ite,(Metodos.redondearDecimales(x, cifS)),(Metodos.redondearDecimales(Gx, cifS)),Metodos.redondearDecimales(error, cifS)});
         }
         return modelo;
    }
    public  DefaultTableModel PF5(){
         int cifS = 4;
        double nivTolerancia, error = 100, x = 0.1, Gx = 0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        int ite = 0;
        while (Math.abs(error) > nivTolerancia) {
            Gx = Math.asin(Math.exp(x)/4);
            error = (Gx - x) / Gx * 100;
            x = Gx;
            ite++;
          modelo.addRow(new Object[]{ite,(Metodos.redondearDecimales(x, cifS)),(Metodos.redondearDecimales(Gx, cifS)),Metodos.redondearDecimales(error, cifS)});
         }
         return modelo;
    }
}
