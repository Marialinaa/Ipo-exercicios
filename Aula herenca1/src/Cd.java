public class Cd extends Item{ 
private String artista; 
private int numeroFaixas; 
//Construtor 
public Cd(String titulo, int 
tempoReproducao, boolean tenhoCopia, String artista, int numeroFaixas) { 
super (titulo, tempoReproducao, tenhoCopia); 
this.artista = artista; 
this.numeroFaixas= numeroFaixas; 
} 
public String getArtista(){ 
return artista; 
} 
public int getNumeroFaixas(){ 
return numeroFaixas; 
} 
public String getDescricaoCd(){ 
String descricao=getDescricaoItem(); 
descricao+= "Artista: "+ artista + "\n" + 
"Número de Faixas: " + numeroFaixas + 
"\n"; 
return descricao; 
} 
}