import java.text.DecimalFormat;
import java.util.Scanner;

public class App11 {
    public App11(){
        //conversor
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.print("Digite quantos graus em CELSIUS: ");
        double celcius = entrada.nextDouble();
        double faren= (celcius*9/5)+32;
        System.out.println(" O valor de "+ df.format(celcius)+  "C em fahrenheit é de: " + df.format(faren)+ "F.");
        entrada.close();

    }
public static void main(String[] args) {
    new App11();
}
}
