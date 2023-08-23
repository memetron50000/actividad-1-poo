import java.util.Scanner;
public class ejercicio4{
    
    public static void main (String[] args) {
        int juan, majuan,alberto,ana;
        Scanner edad =new Scanner (System.in); //scanner para la edad de juan
        System.out.println("ingrese la edad de juan");
        juan =edad.nextInt();  //scanner para la edad de juan

        //calcula la edad de las demas personas
        alberto=2*juan/3;
        ana=4*juan/3;
        majuan=juan+alberto+ana;

        //imprime los valores obtenidos
        System.out.println("edad de juan "+juan);
        System.out.println("edad de alberto "+alberto);
        System.out.println("edad de ana "+ana);
        System.out.println("edad de la mama de juan "+majuan);
    }
}