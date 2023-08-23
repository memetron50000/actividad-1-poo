import java.util.Scanner;
public class ejercicio12{
    public static void main(String[] args){
        double salariobruto, salarioneto, retencion=0.125,pagahora=5000,horas,retfuente;
        Scanner p=new Scanner(System.in);
        System.out.println("ingrese las horas de trabajo");
        horas=p.nextInt();
        salariobruto=pagahora*horas;
        retfuente=salariobruto*retencion;
        salarioneto=salariobruto-retfuente;
        System.out.println("salario bruto= "+salariobruto);
        System.out.println("retencion en la fuente= "+retfuente);
        System.out.println("salario salario neto= "+salarioneto);
    }
}

