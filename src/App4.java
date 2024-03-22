import java.text.DecimalFormat;
import java.util.Scanner;

public class App4 {
    public App4(){
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.0");
        System.out.print("Digite a primeira nota:");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota:");
        double nota2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota:");
        double nota3 = entrada.nextDouble();

    double mediap = (nota1+nota2+nota3)/10;
    System.out.println("A média ponderada total é de: " + df.format(mediap));
    entrada.close();
    };
public static void main(String[] args) {
    new App4();
}
}
