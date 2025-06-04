import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria conta;

        System.out.println("\nNúmero de contas criadas = " + ContaBancaria.getQtdContas());

        for (int i = 0; i < 3; i++) {
            System.out.println("\n###Criando a conta...");
            System.out.print("Entre com o nome do titular: ");
            conta = new ContaBancaria(entrada.nextLine());

            System.out.println("###Depositando...");
            System.out.print("Valor: ");
            conta.depositar(Float.parseFloat(entrada.nextLine()));

            System.out.println("###Sacando...");
            System.out.print("Valor: ");
            conta.sacar(Float.parseFloat(entrada.nextLine()));

            System.out.println("###Imprimindo os dados da conta...");
            System.out.println(conta.getDadosConta());
        }
    }
}
