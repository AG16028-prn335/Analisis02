
package guia02analisis;

import javax.swing.JOptionPane;

public class Bisecciones {
    Double Biseccion1(int c,int n){
      double xi=0,xu=1,xr=0,funcion,xrant=0,Es;
      double Ea;
      int i=1;
      funcion=(Math.exp(xi-1)-(1.5*xi))*(Math.exp(xu-1)-(1.5*xu));
      if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
         Ea=((funcion-xrant)/funcion)*100;
          while (Math.abs(Ea)>Es) {              
               xr=(xi+xu)/2;
               xr=Metodos.redondearDecimales(xr, n+1);
              funcion=(Math.exp(xi-1)-(1.5*xi))*(Math.exp(xr-1)-(1.5*xr));
              Ea=((xr-xrant)/xr)*100;
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
              xrant=xr;
               i++;
          }
         if(c==1){
             return xr;
         }else{
             return Metodos.redondearDecimales(Math.abs(Ea), n+1);
         }
      }
    }

    Double Biseccion2(int c,int n){
      double xi=-2.3562,xu=Math.PI,xr=0,funcion,xrant=0,Es;
      double Ea=100;
      int i=1;
      funcion=((2*Math.sin(xi))-xi)*((2*Math.sin(xu))-xu);
      if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          while (Math.abs(Ea)>Es) {              
               xr=(xi+xu)/2;
               xr=Metodos.redondearDecimales(xr, n+1);
              funcion=((2*Math.sin(xi))-xi)*((2*Math.sin(xr))-xr);
              Ea=((xr-xrant)/xr)*100;
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
              xrant=xr;
               i++;
          }
         if(c==1){
             return Metodos.redondearDecimales(xr, n);
         }else{
             return Metodos.redondearDecimales(Math.abs(Ea), n+1);
         }
      }
    }
    Double Biseccion3(int c,int n){
      double xi=1,xu=2,xr=0,funcion,xrant=0,Es;
      double Ea=100;
      int i=1;
      funcion=((Math.exp(xi))-4)*((Math.exp(xu))-4);
      if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          while (Math.abs(Ea)>Es) {              
               xr=(xi+xu)/2;
               xr=Metodos.redondearDecimales(xr, n+1);
              funcion=((Math.exp(xi))-4)*((Math.exp(xr))-4);
              Ea=((xr-xrant)/xr)*100;
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
              xrant=xr;
               i++;
          }
         if(c==1){
             return Metodos.redondearDecimales(xr, n);
         }else{
             return Metodos.redondearDecimales(Math.abs(Ea), n+1);
         }
      }
    }
    Double Biseccion4(int c,int n){
      double xi=-1,xu=0,xr=0,funcion,xrant=0,Es;
      double Ea=100;
      int i=1;
     // funcion=(Math.sin(xi)-Math.exp(xi-1))*(Math.sin(xu)-Math.exp(xu-1));
      //ninguna de las dos tiene raiz 
      funcion=(((Math.exp(-(xi-1)))*(Math.sin(xi)))-1)*(((Math.exp(-(xu-1)))*(Math.sin(xu)))-1);
              if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          while (Math.abs(Ea)>Es) {              
               xr=(xi+xu)/2;
               xr=Metodos.redondearDecimales(xr, n+1);
              funcion=(((Math.exp(-(xi-1)))*(Math.sin(xi)))-1)*(((Math.exp(-(xu-1)))*(Math.sin(xu)))-1);
              Ea=((xr-xrant)/xr)*100;
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
              xrant=xr;
               i++;
          }
         if(c==1){
             return Metodos.redondearDecimales(xr, n);
         }else{
             return Metodos.redondearDecimales(Math.abs(Ea), n+1);
         }
      }
    }
    Double Biseccion5(int c,int n){
      double xi=0,xu=0.5,xr=0,funcion,xrant=0,Es;
      double Ea=100;
      int i=1;
      funcion=(4*Math.sin(xi)-Math.exp(xi))*(4*Math.sin(xu)-Math.exp(xu));
              if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          while (Math.abs(Ea)>Es) {              
               xr=(xi+xu)/2;
               xr=Metodos.redondearDecimales(xr, n+1);
              funcion=(4*Math.sin(xi)-Math.exp(xi))*(4*Math.sin(xr)-Math.exp(xr));
              Ea=((xr-xrant)/xr)*100;
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
              xrant=xr;
               i++;
          }
         if(c==1){
             return Metodos.redondearDecimales(xr, n);
         }else{
             return Metodos.redondearDecimales(Math.abs(Ea), n+1);
         }
      }
    }
//fin de la clase biseccion
}
