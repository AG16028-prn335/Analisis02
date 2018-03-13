package guia02analisis;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Metodos {
    Double Biseccion1(int c,int n){
      double xi=0,xu=1,xr=0,funcion,funant=0,Es;
      double Ea;
      int i=1;
      funcion=(Math.exp(xi-1)-(1.5*xi))*(Math.exp(xu-1)-(1.5*xu));
      if(funcion>0){
          JOptionPane.showMessageDialog(null, "NO EXISTE RAIZ EN ESTA FUNCION");
          return null;
      }else{
        Es=(0.5)*Math.pow(10,2-n);
          System.out.println("tolerancia "+Es );
         Ea=((funcion-funant)/funcion)*100;
          while (Math.abs(Ea)>Es) {              
              funant=funcion;
              System.out.println("Xi Xu Xr: "+xi+" "+xu+" "+xr);
               xr=(xi+xu)/2;
               xr=redondearDecimales(xr, 8);
              funcion=(Math.exp(xi-1)-(1.5*xi))*(Math.exp(xr-1)-(1.5*xr));
              Ea=((funcion-funant)/funcion)*100;
              if (funcion<0) {
                  xu=xr;
              }else{
                  xi=xr;
              }
               i++;
               System.out.println("Iteracion: "+i);
          }
         if(c==1){
             return xr;
         }else{
             return Ea;
         }
      }
    }

    
    
    void FalsaPosicion(double fx,double inicio,double fin,int n,double Es){
        double gx,Ea,hx;
        //fin
    }
      public static double redondearDecimales(double n, int decimal) {
        double parteEntera, resultado;
        resultado = n;
        if(resultado>0){
            parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, decimal);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, decimal))+parteEntera;
        return resultado;
        }else{
            resultado*=-1;
            parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, decimal);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, decimal))+parteEntera;
        return resultado*-1;
        }
        
    }
    
    
}
