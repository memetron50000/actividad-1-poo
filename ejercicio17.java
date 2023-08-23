import java.math.*;
import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args){
        System.out.println("ingrese el radio del circulo");
        Scanner leer= new Scanner(System.in);
        double radio, area,pi=3.1416, longitud;
        radio=leer.nextInt();
        area= pi * Math.pow(radio, 2);
        longitud= 2*pi*area;
        System.out.println("el area es "+ area);
        System.out.println(" la longitud es "+longitud);
    }
}
