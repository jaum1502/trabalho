import java.util.Scanner;

public class App13 {
    public App13(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o comprimento da parede: ");
        float comp = entrada.nextFloat();
        System.out.println("Digite o altura da parede: ");
        float alt = entrada.nextFloat();
        System.out.println("Digite o valor gasto: ");
        float valorGasto = entrada.nextFloat();
        float area = comp*alt;
        double valor= valorGasto/area;
        double valor2 = valor*112.50;
        System.out.println(valor);
        entrada.close();
    }
    }

