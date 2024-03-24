import java.text.DecimalFormat;
import java.util.Scanner;

public class App3 {
    public App3() {
//-------------------------------------------------------------ENTRADA------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da gasolina: R$");
        double valorgasolina = entrada.nextDouble();
        System.out.println("Digite o valor total pago pela gasolina: R$");
        double valorpago = entrada.nextDouble();
//-------------------------------------------------------------PROCESSO------------------------------------------------------------------------
        double vt = valorpago / valorgasolina;
//-------------------------------------------------------------SAÍDA------------------------------------------------------------------------
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Com " + df.format(valorpago) + " deu pra encher " + df.format(vt) + "L do tanque de gasolina");
        entrada.close();
    }
    public static void main(String[] args) {
        new App3();
    }
}
