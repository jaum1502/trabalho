import java.text.DecimalFormat;
import java.util.Scanner;

public class App7 {
    public App7(){
//-------------------------------------------------------------ENTRADA------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.0");
        System.out.println("Digite quantas garrrafas de 350ml foram comprada:");
        double pequena = entrada.nextDouble();
        System.out.println("Digite quantas garrrafas de 600ml foram comprada:");
        double media = entrada.nextDouble();
        System.out.println("Digite quantas garrrafas de 2L foram comprada:");
        double grande = entrada.nextDouble();
//-------------------------------------------------------------PROCESSO------------------------------------------------------------------------
        double valor1= 0.350*pequena;
        double valor2= 0.600*media;
        double valor3= 2*grande;
        double total= valor1+valor2+valor3;
//-------------------------------------------------------------SAÍDA------------------------------------------------------------------------
        System.out.println("No total foram " + df.format(total)+ "L");
        entrada.close();
    }
public static void main(String[] args) {
    new App7();
}
}
