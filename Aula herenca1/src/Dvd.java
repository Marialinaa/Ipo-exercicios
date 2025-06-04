public class Dvd extends Item{
    private String ano;
    private String genero;
    private String diretor;
    public Dvd(String titulo, int tempoReproducao, boolean tenhoCopia, String ano, String genero, String diretor) {
        super(titulo, tempoReproducao, tenhoCopia);
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
    }
    public String getAno() {
        return ano;
    }
    public String getGenero() {
        return genero;
    }
    public String getDiretor() {
        return diretor;
    }
    public String getDescricaoDvd(){
        String descricao=getDescricaoItem();
        descricao+="\nAno: "+ ano + "\n" +
                "Gênero: " + genero + "\n" +
                "Diretor: " + diretor + "\n";
                return descricao;
    }
}
