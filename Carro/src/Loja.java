import java.util.ArrayList;
import java.util.Iterator;


public class Loja {
    private String nome;
    private static int totalJogosCadastrados = 0;
    private ArrayList<Jogo> jogos;
    public Loja(String nome) {
        this.nome = nome;
        jogos = new ArrayList<>();
    }
    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
        totalJogosCadastrados++;
    }
    public void removerJogosCaros(double precoMaximo){
        Iterator<Jogo> iterator = jogos.iterator();
        while (iterator.hasNext()) {
            Jogo jogo = iterator.next();
            if (jogo.getPreco() > precoMaximo) {
                iterator.remove(); // remove com segurança durante a iteração
                totalJogosCadastrados--;
            }
        }
    }
public void printJogosAcimaDe(double valor){
for(Jogo jogo: jogos){
    if(jogo.getPreco() > valor){
        System.out.println("Nome: " + jogo.getNome() + ", Gênero: " + jogo.getGenero() + ", Preço: R$" + jogo.getPreco());
    }
}

}
public double mediaPreco(){
    double soma = 0.0;
    if(jogos.isEmpty()) {
        return 0.0;
    }
    for(Jogo jogo:jogos){
        soma += jogo.getPreco();
    }
    return soma / jogos.size();
}
public static int getTotalJogosCadastrados() {
    return totalJogosCadastrados;
}
}
