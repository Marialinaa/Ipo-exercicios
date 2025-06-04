import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Livro> livros;
    public Carrinho() {
        livros = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Preço: " + livro.getPreco() + ", Gênero: " + livro.getGenero());
        }
    }
    public double calcularTotal() {
        double total = 0;
        for (Livro livro : livros) {
            total += livro.getPreco();
        }
        return total;
    }
}
