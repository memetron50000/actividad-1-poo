import java.util.Scanner;
import java.math.*;
public class ejercicio14{
    public static void main(String[] args) {
        double numero,numcua,numcub;
        System.out.println("ingrese el numero");
        Scanner leer = new Scanner (System.in);//scaner del radio
        numero=leer.nextInt();

        numcua=Math.pow(numero,2);//numero al cuadrado
        numcub=Math.pow(numero,3);//numero al cubo

        System.out.println("el cuadrado del numero es "+numcua);
        System.out.println("el cubo del numero es "+numcub);
        
} 
}
