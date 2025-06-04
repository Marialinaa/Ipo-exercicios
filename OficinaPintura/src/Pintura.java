import java.util.ArrayList;

public class Pintura{
    private String tipoBase;
    private ArrayList<Integer> codEfeitos;
    public Pintura(String tipoBase){
        this.tipoBase = tipoBase;
        codEfeitos = new ArrayList<>();
    }
    public String getTipoBase() {
        return tipoBase;
    }
    public void adicionarEfeito(int codigoEfeito) {
       codEfeitos.add(codigoEfeito);
    }
    public int getQuantidadeEfeitos() {
        return codEfeitos.size();
    }
    public int getEfeito(int indice){
        if(indice>=0 && indice < codEfeitos.size()) {
            return codEfeitos.get(indice);
        }
        return -1; // Retorna -1 se o índice for inválido
    }
    public void removerEfeito(int codigoEfeito) {
        codEfeitos.remove(codigoEfeito);
    }
}