import java.text.DecimalFormat;
import java.util.Scanner;

public class App8 {
    public App8(){
        Scanner entrada= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.00");
        System.out.println("Digite o valor em dólares: ");
        double dolar= entrada.nextDouble();
        double total= dolar*4.97;
        System.out.println("Você deverá receber: R$" + df.format(total));
        entrada.close();
    }
public static void main(String[] args) {
    new App8();
}
}