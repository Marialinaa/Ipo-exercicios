public class App {
    public static void main(String[] args) throws Exception {
        Jogo j1 = new Jogo("Zelda", "Aventura", 299.99);
        Jogo j2 = new Jogo("Minecraft", "Sandbox", 100.00);
        Jogo j3 = new Jogo("Elden Ring", "RPG", 349.90);

        Loja loja = new Loja("GameStore");

        loja.adicionarJogo(j1);
        loja.adicionarJogo(j2);
        loja.adicionarJogo(j3);

        System.out.println("Jogos com preço acima de R$200:");
        loja.printJogosAcimaDe(200);

        System.out.println("Média de preço: " + loja.mediaPreco());

        loja.removerJogosCaros(300);

        System.out.println("Jogos restantes após remoção:");
        loja.printJogosAcimaDe(0);

        System.out.println("Total de jogos cadastrados: " + Loja.getTotalJogosCadastrados());
    }
}
