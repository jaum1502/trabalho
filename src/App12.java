import java.util.Scanner;

public class App12 {
    public App12() {
        // -----------------------------------------------------------------------
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário ");
        String nome = entrada.nextLine();
        System.out.println("Digite o número de horas trabalhadas: ");
        float horas = entrada.nextFloat();
        System.out.println("Digite o número de dependentes");
        int dependentes = entrada.nextInt();
        // -----------------------------------------------------------------------

        double valorDep = (dependentes * 60);
        double impvalorDep = valorDep*0.135;
        double horasT = (horas * 10);
        double impHorasT = horas*0.005;
        double salarioTrabalhoB=valorDep+horasT;
        double salarioTrabalhoL=salarioTrabalhoB-impvalorDep-impHorasT;

        // -----------------------------------------------------------------------
        entrada.close();
        System.out.println("NOME: " + nome);
        System.out.println("SALÁRIO BRUTO: " + salarioTrabalhoB);
        System.out.println("SALÁRIO LÍQUIDO: "+salarioTrabalhoL);
    }

    public static void main(String[] args) {
new App12();
    }
}
