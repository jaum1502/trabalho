import java.text.DecimalFormat;
import java.util.Scanner;

public class App6 {
    public App6() {
//-------------------------------------------------------------ENTRADA------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.print("Digite quantos KG de comida foi pego: ");
//-------------------------------------------------------------PROCESSO------------------------------------------------------------------------
        double comida = entrada.nextDouble();
        double total = comida - 0.750;
        double comidaValor = total * 25.00;
//-------------------------------------------------------------SAÍDA------------------------------------------------------------------------
        System.out.println("O valor total a pagar é de: R$" + df.format(comidaValor));
        entrada.close();
    }
    public static void main(String[] args) {
        new App6();
    }
}