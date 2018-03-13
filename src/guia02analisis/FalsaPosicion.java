
package guia02analisis;

import javax.swing.JOptionPane;

public class FalsaPosicion {
    
    
   Double FalsaPos1(int c,int n){
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
         if(c==1){
             return Metodos.redondearDecimales(xr, n);
         }else{
             return Math.abs(Ea);
         }
      }
    }
   Double FalsaPos2(int c,int n){
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
         if(c==1){
             return Metodos.redondearDecimales(xr, n);
         }else{
             return Metodos.redondearDecimales(Math.abs(Ea), n);
         }
      }
    }
   Double FalsaPos3(int c,int n){
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
         if(c==1){
             return Metodos.redondearDecimales(xr, n);
         }else{
             return Metodos.redondearDecimales(Math.abs(Ea), n);
         }
      }
    }
    Double FalsaPos4(int c,int n){
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
         if(c==1){
             return Metodos.redondearDecimales(xr, n);
         }else{
             return Metodos.redondearDecimales(Math.abs(Ea), n);
         }
      }
    }
    Double FalsaPos5(int c,int n){
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
         if(c==1){
             return Metodos.redondearDecimales(xr, n);
         }else{
             return Metodos.redondearDecimales(Math.abs(Ea), n);
         }
      }
    }
   //fin de falsa posicion
}
