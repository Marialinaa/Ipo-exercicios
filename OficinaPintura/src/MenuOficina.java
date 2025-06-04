import java.util.Scanner;

public class MenuOficina {
    private String[] tiposPintura = {"Automotiva", "Predial", "Artística"};
    private double[] tempoBaseHoras = {6.0, 5.0, 8.0};

    private String[] efeitos = {"Brilho", "Textura", "Verniz"};
    private double[] tempoAdicionalHoras = {0.5, 1.5, 1.0};

    private Scanner scanner = new Scanner(System.in);
    private Pintura pinturaAtual;

    public void iniciar() {
        criarPinturaBase();
        menuOpcoes();
    }

    private void criarPinturaBase() {
        System.out.println("### Selecione o tipo de pintura base:");
        for (int i = 0; i < tiposPintura.length; i++) {
            System.out.println(i + " - " + tiposPintura[i] + " (" + tempoBaseHoras[i] + " horas)");
        }
        System.out.print("Escolha o índice da pintura base: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < tiposPintura.length) {
            pinturaAtual = new Pintura(tiposPintura[indice]);
            System.out.println("Pintura criada com base: " + tiposPintura[indice]);
        } else {
            System.out.println("Índice inválido. Tente novamente.");
            criarPinturaBase();
        }
    }

    private void menuOpcoes() {
        int opcao;
        do {
            System.out.println("\n######## Menu de Opções ########");
            System.out.println("1. Adicionar Efeito");
            System.out.println("2. Remover Efeito");
            System.out.println("3. Exibir Orçamento de Tempo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    adicionarEfeito();
                    break;
                case 2:
                    removerEfeito();
                    break;
                case 3:
                    exibirOrcamento();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }

    private void adicionarEfeito() {
        System.out.println("Efeitos disponíveis:");
        for (int i = 0; i < efeitos.length; i++) {
            System.out.println(i + " - " + efeitos[i] + " (+" + tempoAdicionalHoras[i] + " horas)");
        }
        System.out.print("Escolha o índice do efeito a adicionar: ");
        int codigo = scanner.nextInt();
        if (codigo >= 0 && codigo < efeitos.length) {
            pinturaAtual.adicionarEfeito(codigo);
            System.out.println("Efeito \"" + efeitos[codigo] + "\" adicionado.");
        } else {
            System.out.println("Código inválido.");
        }
    }

    private void removerEfeito() {
        if (pinturaAtual.getQuantidadeEfeitos() == 0) {
            System.out.println("Nenhum efeito para remover.");
            return;
        }
        System.out.println("Efeitos atuais:");
        for (int i = 0; i < pinturaAtual.getQuantidadeEfeitos(); i++) {
            int cod = pinturaAtual.getEfeito(i);
            System.out.println(i + " - " + efeitos[cod]);
        }
        System.out.print("Informe o índice do efeito a remover: ");
        int codigo = scanner.nextInt();
        if (codigo >= 0 && codigo < efeitos.length) {
            pinturaAtual.removerEfeito(codigo);
            System.out.println("Efeito removido.");
        } else {
            System.out.println("Código inválido.");
        }
    }

    private void exibirOrcamento() {
        System.out.println("\n############### ORÇAMENTO ###############");
        System.out.println("Tipo de pintura: " + pinturaAtual.getTipoBase());

        double tempoBase = 0;
        for (int i = 0; i < tiposPintura.length; i++) {
            if (tiposPintura[i].equals(pinturaAtual.getTipoBase())) {
                tempoBase = tempoBaseHoras[i];
                break;
            }
        }
        System.out.println("Tempo base: " + tempoBase + " horas");

        double tempoTotal = tempoBase;

        if (pinturaAtual.getQuantidadeEfeitos() > 0) {
            System.out.println("Efeitos:");
            for (int i = 0; i < pinturaAtual.getQuantidadeEfeitos(); i++) {
                int cod = pinturaAtual.getEfeito(i);
                System.out.println("   " + efeitos[cod] + " - " + tempoAdicionalHoras[cod] + " hora(s)");
                tempoTotal += tempoAdicionalHoras[cod];
            }
        } else {
            System.out.println("Efeitos: Nenhum");
        }

        System.out.printf("Tempo total estimado: %.1f horas\n", tempoTotal);
        System.out.println("#########################################");
    }
}
