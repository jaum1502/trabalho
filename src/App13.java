import java.text.DecimalFormat;
import java.util.Scanner;

public class App13 {
    public App13(){
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite o comprimento da parede: ");
        float comp = entrada.nextFloat();
        System.out.println("Digite o altura da parede: ");
        float alt = entrada.nextFloat();
        int mq = 9;
        double vmq = 12.50;
        double area = comp*alt;
        double valor = area*mq;
        double valorFinal = valor*vmq;
        System.out.println("O total deu R$" + df.format(valorFinal));
        entrada.close();
    }
    public static void main(String[] args) {
        new App13();
    }
    }

