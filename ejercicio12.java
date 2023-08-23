import java.util.Scanner;
public class ejercicio12{
    public static void main(String[] args){
        double salariobruto, salarioneto, retencion=0.125,pagahora=5000,horas,retfuente;
        Scanner p=new Scanner(System.in);//scaner de las horas de trabajo
        System.out.println("ingrese las horas de trabajo");
        horas=p.nextInt();//scaner de las horas de trabajo

        salariobruto=pagahora*horas;
        retfuente=salariobruto*retencion;
        salarioneto=salariobruto-retfuente;

        //imprime los valores obtenidos
        System.out.println("salario bruto= "+salariobruto);
        System.out.println("retencion en la fuente= "+retfuente);
        System.out.println("salario salario neto= "+salarioneto);
    }
}

