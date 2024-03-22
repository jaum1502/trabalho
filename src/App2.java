import java.text.DecimalFormat;
import java.util.Scanner;

public class App2 {
public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    System.out.print("Digite o valor do sapato: R$");
    Double valor = entrada.nextDouble();

    Double valor2=valor*0.12;
    double valor3= valor-valor2;


    DecimalFormat df= new DecimalFormat("0.00");

    System.out.println("O valor do desconto é de: R$"+ df.format(valor2));
    System.out.print("O valor dos sapatos com desconto é de: R$" + df.format(valor3));
    entrada.close();


}

}