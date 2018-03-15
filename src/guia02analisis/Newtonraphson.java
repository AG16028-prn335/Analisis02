/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia02analisis;

import javax.swing.table.DefaultTableModel;


public class Newtonraphson {
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"iteracion","Xi","Xi+1","Ea%"}, 0);
    public  DefaultTableModel NR1(){
        int cifS = 7, ite=0;
        double nivTolerancia , error = 100, x=0, x1=0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
         while (Math.abs(error) > nivTolerancia) {
            x1=x-((Math.exp(x-1)-1.5*x)/(Math.exp(x-1)-1.5));
            error=(x1-x)/x1*100;
            x=x1;
            ite++;
            modelo.addRow(new Object[]{ite,x,x1,error});
         }
         return modelo;
    }  
    public  DefaultTableModel NR2(){
        int cifS = 3, ite = 0;
        double nivTolerancia, error = 100, x = -2.3562, x1 = 0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        x = Math.toRadians(x);
        while (Math.abs(error) > nivTolerancia) {
            x1 = Math.asin(x/2);
            error = (x1 - x) / x1 * 100;
            x = x1;
            ite++;
         modelo.addRow(new Object[]{ite,x,x1,error});
         }
         return modelo; 
    }
    public  DefaultTableModel NR3(){
    int cifS = 4, ite=0;
        double nivTolerancia, error = 100, x=1.5, x1=0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        
         while (Math.abs(error) > nivTolerancia) {
            x1=Math.log(4);
            error=(x1-x)/x1*100;
            x=x1;
            ite++;
          modelo.addRow(new Object[]{ite,x,x1,error});
         }
         return modelo; 
    }
    public  DefaultTableModel NR4(){
    int cifS = 3, ite = 0;
        double nivTolerancia, error = 100, x = -0.5, x1 = 0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));

        x = Math.toRadians(x);
        while (Math.abs(error) > nivTolerancia) {
            x1 = x - ((Math.exp(-(x-1))*Math.sin(x)-1) / (-Math.exp(-(x-1))*Math.sin(x)+Math.exp(-(x-1))*Math.cos(x)));
            error = (x1 - x) / x1 * 100;
            x = x1;
            ite++;
          modelo.addRow(new Object[]{ite,x,x1,error});
         }
         return modelo; 
    }
    public  DefaultTableModel NR5(){
     int cifS = 7, ite=0;
        double nivTolerancia, error = 100, x=0.1, x1=0;
        nivTolerancia = (0.5 * Math.pow(10, (2 - cifS)));
        
         while (Math.abs(error) > nivTolerancia) {
            x1=x-((4*Math.sin(x)-Math.exp(x))/(4*Math.cos(x)-Math.exp(x)));
            error=(x1-x)/x1*100;
            x=x1;
            ite++;
          modelo.addRow(new Object[]{ite,x,x1,error});
         }
         return modelo; 
    }
    
}
