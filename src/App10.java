import java.text.DecimalFormat;
import java.util.Scanner;

public class App10 {
    public App10() {
//-------------------------------------------------------------ENTRADA------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Digite o comprimento do cateto A: ");
        double catetoA = entrada.nextDouble();
        System.out.print("Digite o comprimento do cateto B: ");
        double catetoB = entrada.nextDouble();
//-------------------------------------------------------------PROCESSO------------------------------------------------------------------------
        double catetos = (catetoA*catetoA) + (catetoB*catetoB);
        double hipotenusa = Math.sqrt(catetos);
//-------------------------------------------------------------SAÍDA------------------------------------------------------------------------
        System.out.print("O valor da hipotenusa é de: " + df.format(hipotenusa));
        
        entrada.close();
    }

    public static void main(String[] args) {
        new App10();
    }
}