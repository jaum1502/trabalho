import java.util.Scanner;

public class App15 {
    public App15() {
        //-------------------------------------------------------------ENTRADA------------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int valor1 = entrada.nextInt();
        //-------------------------------------------------------------PROCESSO------------------------------------------------------------------------
        int centena = valor1 / 100;
        int dezena = (valor1 % 100) / 10;
        int unidade = (valor1 % 10);
        //-------------------------------------------------------------SAÍDA------------------------------------------------------------------------
        System.out.print(centena + " centena(s)      " + dezena + " dezena(s)     " + unidade + " unidade(s)");
        entrada.close();
    }

    public static void main(String[] args) {
        new App15();
    }
}
