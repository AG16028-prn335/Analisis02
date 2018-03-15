package guia02analisis;

import java.text.DecimalFormat;


public class Metodos {
    
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
    public static String Decimal(double n){
        return new DecimalFormat("#.##############").format(n);     
    }
}
