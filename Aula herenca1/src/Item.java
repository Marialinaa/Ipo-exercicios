public class Item {
    private String titulo;
    private int tempoReproducao;
    private boolean tenhoCopia;
private String comentario;

    // Construtor
public Item(String titulo, int tempoReproducao, 
boolean tenhoCopia) { 
this.titulo =titulo; 
this.tempoReproducao= tempoReproducao; 
this.tenhoCopia= tenhoCopia; 
comentario = ""; 
}

public void setComentario(String comentario) { 
this.comentario=comentario; 
}

    public String getComentario() {
        return comentario;
    }

public boolean getTenhoCopia() {
  return tenhoCopia;  
 }

public String getDescricaoItem(){ 
String resposta; 
if(getTenhoCopia()) resposta = "sim"; 
else resposta = "não"; 
return "Titulo: " + titulo + "\n" + "Tempo de Reprodução: " + tempoReproducao + "\n" + "Tenho Cópia?:" + resposta + "\n" + "Comentário: " + comentario + "\n"; 
}
}