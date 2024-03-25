import java.util.Scanner;

public class App16 {
    public App16() {
        //-------------------------------------------------------------ENTRADAteste------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int valor1 = entrada.nextInt();
        //-------------------------------------------------------------PROCESSO------------------------------------------------------------------------
        int centena = valor1 / 100;
        int dezena = (valor1 % 100) / 10;
        int unidade = (valor1 % 10);
        //-------------------------------------------------------------SAÍDA------------------------------------------------------------------------
        System.out.println(unidade + " cédula(s) de R$1");
        System.out.println(dezena + " cédula(s) de R$10");
        System.out.println(centena + " cédula(s) de R$100");
        entrada.close();
    }
    public static void main(String[] args) {
        new App16();
    }
}
