import java.text.DecimalFormat;
import java.util.Scanner;

public class App14 {
    public App14() {

//-------------------------------------------------------------ENTRADA------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        DecimalFormat distancia = new DecimalFormat("0");
        DecimalFormat dindin = new DecimalFormat("0.00");
        System.out.println("Digite a distância percorrida:");
        float dist = entrada.nextFloat();
        System.out.println("Digite em quantos minutos foi realizado esse percurso:");
        float min = entrada.nextFloat();
//-------------------------------------------------------------PROCESSO------------------------------------------------------------------------
        double velMedia = dist / min;
        double comb = dist / 12;
//-------------------------------------------------------------SAÍDA------------------------------------------------------------------------
        System.out.println("Velocidade média: " + distancia.format(velMedia) + " km/h");
        System.out.println("Combustível gasto: R$" + dindin.format(comb));
        entrada.close();
    }
 
    public static void main(String[] args) {
        new App14();
    }
}
