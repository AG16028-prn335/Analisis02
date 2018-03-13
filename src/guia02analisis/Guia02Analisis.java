
package guia02analisis;


public class Guia02Analisis {
    public static void main(String[] args) {
        Bisecciones b =new Bisecciones();
        FalsaPosicion p=new FalsaPosicion();
        System.out.println(Metodos.Decimal(b.Biseccion5(1,4)));
        System.out.println(Metodos.Decimal(b.Biseccion5(2,4)));
        System.out.println("");
        System.out.println(Metodos.Decimal(p.FalsaPos5(1,4)));
        System.out.println(Metodos.Decimal(p.FalsaPos5(2,4)));
        
    }
}
