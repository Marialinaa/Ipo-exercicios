public class App {
    public static void main(String[] args) throws Exception {
         // Criando um aluno
        Aluno aluno = new Aluno("Maria", "Bolsista");

        // Inserindo notas
        aluno.inserirNota(80);
        aluno.inserirNota(70);
        aluno.inserirNota(50);

        // Exibindo informações
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Nota da disciplina 1: " + aluno.getNota(0));
        System.out.println("Coeficiente de rendimento: " + aluno.getCoficienteRendimento());
        System.out.println("Situação final: " + aluno.getSituacaoFinal());
    }
}
