import java.util.ArrayList;

public class GerenciamentoItem {
    private ArrayList<Item> itens;

    public GerenciamentoItem() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void exibirItens() {
        for (Item item : itens) {
            System.out.println(item.getDescricaoItem());
            if (item instanceof Cd) {
                Cd cd = (Cd) item;
                System.out.println("Artista: " + cd.getArtista());
                System.out.println("Número de Faixas: " + cd.getNumeroFaixas());
            } else if (item instanceof Dvd) {
                Dvd dvd = (Dvd) item;
                System.out.println("Ano: " + dvd.getAno());
                System.out.println("Gênero: " + dvd.getGenero());
                System.out.println("Diretor: " + dvd.getDiretor());
            }
            System.out.println("-----------------------------");
        }
    }
}
