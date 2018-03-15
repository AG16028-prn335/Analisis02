
package guia02analisis;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FalsaPosicion {
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"iteracion","Xi","Xu","Xr","F(Xr)","Ea%"}, 0);
    
  public  DefaultTableModel FP1(int n){
      double xi=0,xu=1,xr=0,funcion,xrant=0,Es,funxu,funxi;
      double Ea=100;
      int i=1;
      funxi=Math.exp(xi-1)-(1.5*xi);
      funxu=(Math.exp(xu-1)-(1.5*xu));
      funcion=funxi*funxu;
      if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          while (Math.abs(Ea)>Es) {              
              xr=xu-((funxu*(xi-xu))/(funxi-funxu));
              funcion=funxi*(Math.exp(xr-1)-(1.5*xr));
              Ea=((xr-xrant)/xr)*100;
              if(i==1){
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,"--"});
              }else{
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,(Metodos.redondearDecimales(Ea, n))});
              }
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
               funxi=Math.exp(xi-1)-(1.5*xi);
               funxu=Math.exp(xu-1)-(1.5*xu);
              xrant=xr;
               i++;
          }
         return modelo;
      }
    }
   public  DefaultTableModel FP2(int n){
      double xi=-2.3562,xu=Math.PI,xr=0,funcion,xrant=0,Es,funxu,funxi;
      double Ea=100;
      int i=1;
      funxi=((2*Math.sin(xi))-xi);
      funxu=((2*Math.sin(xu))-xu);
      funcion=funxi*funxu;
      if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          while (Math.abs(Ea)>Es) {              
              xr=xu-((funxu*(xi-xu))/(funxi-funxu));
              funcion=funxi*((2*Math.sin(xr))-xr);
              Ea=((xr-xrant)/xr)*100;
              if(i==1){
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,"--"});
              }else{
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,(Metodos.redondearDecimales(Ea, n))});
              }
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
               funxi=((2*Math.sin(xi))-xi);
               funxu=((2*Math.sin(xu))-xu);
              xrant=xr;
               i++;
          }
         return modelo;
      }
    }
   public  DefaultTableModel FP3(int n){
      double xi=1,xu=2,xr=0,funcion,xrant=0,Es,funxu,funxi;
      double Ea=100;
      int i=1;
      funxi=(Math.exp(xi))-4;
      funxu=(Math.exp(xu))-4;
      funcion=funxi*funxu;
      if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          while (Math.abs(Ea)>Es) {              
              xr=xu-((funxu*(xi-xu))/(funxi-funxu));
              funcion=funxi*((Math.exp(xr))-4);
              Ea=((xr-xrant)/xr)*100;
              if(i==1){
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,"--"});
              }else{
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,(Metodos.redondearDecimales(Ea, n))});
              }
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
               funxi=(Math.exp(xi))-4;
               funxu=(Math.exp(xu))-4;
              xrant=xr;
               i++;
          }
        return modelo;
      }
    }
    public  DefaultTableModel FP4(int n){
      double xi=-1,xu=0,xr=0,funcion,xrant=0,Es,funxu,funxi;
      double Ea=100;
      int i=1;
      funxi=((Math.exp(-(xi-1)))*(Math.sin(xi)))-1;
      funxu=((Math.exp(-(xu-1)))*(Math.sin(xu)))-1;
      funcion=funxi*funxu;
      if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          while (Math.abs(Ea)>Es) {              
              xr=xu-((funxu*(xi-xu))/(funxi-funxu));
              funcion=funxi*(((Math.exp(-(xr-1)))*(Math.sin(xr)))-1);
              Ea=((xr-xrant)/xr)*100;
              if(i==1){
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,"--"});
              }else{
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,(Metodos.redondearDecimales(Ea, n))});
              }
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
              funxi=((Math.exp(-(xi-1)))*(Math.sin(xi)))-1;
              funxu=((Math.exp(-(xu-1)))*(Math.sin(xu)))-1;
              xrant=xr;
               i++;
          }
       return modelo;
      }
    }
   public  DefaultTableModel FP5(int n){
      double xi=0,xu=0.5,xr=0,funcion,xrant=0,Es,funxu,funxi;
      double Ea=100;
      int i=1;
      funxi=4*Math.sin(xi)-Math.exp(xi);
      funxu=4*Math.sin(xu)-Math.exp(xu);
      funcion=funxi*funxu;
      if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          while (Math.abs(Ea)>Es) {              
              xr=xu-((funxu*(xi-xu))/(funxi-funxu));
              funcion=funxi*(4*Math.sin(xr)-Math.exp(xr));
              Ea=((xr-xrant)/xr)*100;
              if(i==1){
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,"--"});
              }else{
                  modelo.addRow(new Object []{i,(Metodos.redondearDecimales(xi, n)),(Metodos.redondearDecimales(xu, n)),(Metodos.redondearDecimales(xr, n)),funcion,(Metodos.redondearDecimales(Ea, n))});
              }
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
              funxi=4*Math.sin(xi)-Math.exp(xi);
              funxu=4*Math.sin(xu)-Math.exp(xu);
              xrant=xr;
               i++;
          }
        return modelo;
      }
    }
   //fin de falsa posicion
}
