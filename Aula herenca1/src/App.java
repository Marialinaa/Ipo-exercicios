import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciamentoItem gerenciamento = new GerenciamentoItem();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar CD");
            System.out.println("2. Cadastrar DVD");
            System.out.println("3. Exibir todos os itens");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (opcao == 1) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Tempo de reprodução (min): ");
                int tempo = scanner.nextInt();
                System.out.print("Tenho cópia? (true/false): ");
                boolean tenho = scanner.nextBoolean();
                scanner.nextLine(); // limpar buffer
                System.out.print("Artista: ");
                String artista = scanner.nextLine();
                System.out.print("Número de faixas: ");
                int faixas = scanner.nextInt();

                Cd cd = new Cd(titulo, tempo, tenho, artista, faixas);
                gerenciamento.adicionarItem(cd);

            } else if (opcao == 2) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Tempo de reprodução (min): ");
                int tempo = scanner.nextInt();
                System.out.print("Tenho cópia? (true/false): ");
                boolean tenho = scanner.nextBoolean();
                scanner.nextLine(); // limpar buffer
                System.out.print("Ano: ");
                String ano = scanner.nextLine();
                System.out.print("Gênero: ");
                String genero = scanner.nextLine();
                System.out.print("Diretor: ");
                String diretor = scanner.nextLine();

                Dvd dvd = new Dvd(titulo, tempo, tenho, ano, genero, diretor);
                gerenciamento.adicionarItem(dvd);

            } else if (opcao == 3) {
                gerenciamento.exibirItens();
            }

        } while (opcao != 0);

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
