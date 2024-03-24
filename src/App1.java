import java.text.DecimalFormat;
import java.util.Scanner;

public class App1 {
    public App1(){
//-------------------------------------------------------------ENTRADA------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        System.out.print("Digite a largura do terreno (em mts): ");
        float larg = entrada.nextFloat();
        System.out.print("Digite o comprimento do terreno: (em mts)");
        float comp = entrada.nextFloat();
//-------------------------------------------------------------PROCESSO------------------------------------------------------------------------
        float area = larg*comp;
//-------------------------------------------------------------SAÍDA------------------------------------------------------------------------
        System.out.print("A área total do terreno é de: " + df.format(area)+ "mt²");
        entrada.close();
    }
    public static void main(String[] args) throws Exception {
 new App1();
    }
}
