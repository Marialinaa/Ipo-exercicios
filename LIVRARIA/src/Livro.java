public class Livro{
    private String titulo;
    private double preco;
    private String genero;
    public Livro(String titulo, double preco, String genero){
        this.titulo = titulo;
        this.preco = preco;
        this.genero = genero;
    }
    public String getTitulo() {
        return titulo;
    }
    public double getPreco() {
        return preco;
    }
    public String getGenero() {
        return genero;
    }
}