import java.text.DecimalFormat;
import java.util.Scanner;

public class App5 {
    public App5(){
//-------------------------------------------------------------ENTRADA------------------------------------------------------------------------
        Scanner entrada = new Scanner((System.in));
        DecimalFormat df= new DecimalFormat("00.00");
        System.out.print("Digite quantas galinhas há nesse galinheiro: ");
        double quantidade= entrada.nextDouble();
//-------------------------------------------------------------PROCESSO------------------------------------------------------------------------
        double total=quantidade*11; // 11 é o valor da soma
//-------------------------------------------------------------SAÍDA------------------------------------------------------------------------
        System.out.print("O valor total do galinheiro deu: R$" + df.format(total));
        entrada.close();

    }
public static void main(String[] args) {
    new App5();
}
}
