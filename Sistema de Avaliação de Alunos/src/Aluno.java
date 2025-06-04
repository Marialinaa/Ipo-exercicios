import java.util.ArrayList;

public class Aluno {
private String nome;
private String categoria;
private ArrayList<Integer> notas;
 
public Aluno(String nome,String categoria) {
    this.nome = nome;
    this.categoria = categoria;
    this.notas = new ArrayList<>();
 
 }
    public String getNome() {
        return nome;
    }

public void inserirNota(int nota){
if(nota>0 && nota<=100){
notas.add(nota);
}
}

public int getNota(int indice){
if(indice>0 && indice<= notas.size()){    
return notas.get(indice);
}
return -1;
}

public double getCoficienteRendimento(){
    if(notas.isEmpty()) {
        return 0;
    }
    int soma = 0;
    for(int nota : notas) {
        soma += nota;
    }
    return (double) soma / notas.size();
}

public String getSituacaoFinal() {
    double coeficiente = getCoficienteRendimento();

    if (categoria.equalsIgnoreCase("bolsista")) {
        if (coeficiente >= 75) {
            return "Regular";
        } else {
            return "Desligado";
        }
    } else if (categoria.equalsIgnoreCase("não-bolsista")) {
        if (coeficiente >= 70) {
            return "Regular";
        } else {
            return "Desligado";
        }
    } else {
        return "Categoria inválida";
    }
}
}