import java.util.Scanner;
public class ejercicio4{
    
    public static void main (String[] args) {
        int juan, majuan,alberto,ana;
        Scanner edad =new Scanner (System.in);   
        System.out.println("ingrese la edad de juan");
        juan =edad.nextInt();  
        alberto=2*juan/3;
        ana=4*juan/3;
        majuan=juan+alberto+ana;
        System.out.println("edad de juan "+juan);
        System.out.println("edad de alberto "+alberto);
        System.out.println("edad de ana "+ana);
        System.out.println("edad de la mama de juan "+majuan);
    }
}