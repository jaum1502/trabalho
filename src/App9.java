import java.text.DecimalFormat;
import java.util.Scanner;

public class App9 {
    public App9(){
        Scanner entrada= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.00");
        System.out.print("Digite o valor do raio: ");
        double raio= entrada.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura= entrada.nextDouble();
        double pi = Math.PI;
        double volume= pi*(raio*raio)*altura;
        System.out.println("O valor total do volume é de: "+ df.format(volume));
        entrada.close();

    }
public static void main(String[] args) {
    new App9();
}
}
