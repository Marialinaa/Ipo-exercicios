import java.util.Scanner;

public class Menu {
    private Carrinho carrinho;
    private Livro livro;
    private Scanner scanner = new Scanner(System.in);
    public Menu() {
        carrinho = new Carrinho();
    }
public void exibirMenu(){
int opcao;
do{
    menuopcaoUsuario();
    opcao = scanner.nextInt();
}
while(opcao != 0);
}
public void menuopcaoUsuario() {
    System.out.println("1 - Adicionar Livro ao Carrinho");
    System.out.println("2 - Remover Livro do Carrinho");
    System.out.println("3 - Calcular Total do Carrinho");
    System.out.println("4 - Sair");

}
public void insirirDadosLivro(){
System.out.print("Digite o título do livro: ");
    String titulo = scanner.nextLine();
    System.out.print("Digite o preço do livro: ");
    double preco = scanner.nextDouble();
    scanner.nextLine(); // Consumir a quebra de linha
    System.out.print("Digite o gênero do livro: ");
    String genero = scanner.nextLine();
    
    Livro livro = new Livro(titulo, preco, genero);
    carrinho.adicionarLivro(livro);
    System.out.println("Livro adicionado com sucesso!");

}

}