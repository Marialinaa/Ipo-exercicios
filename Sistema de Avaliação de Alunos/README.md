# Projeto: Sistema de Avaliação de Alunos

Este é um projeto simples em Java que representa um sistema de avaliação de alunos, permitindo o cadastro de notas, cálculo do coeficiente de rendimento e determinação da situação final do aluno com base em sua categoria.

# Funcionalidades
Criar um aluno informando nome e categoria (bolsista ou não-bolsista).

Inserir notas válidas (entre 1 e 100).

Calcular o coeficiente de rendimento.

Verificar a situação final do aluno:

Bolsista:

Coeficiente ≥ 75 → Regular

Coeficiente < 75 → Desligado

Não-bolsista:

(Regra a ser completada)

✅ Exemplo de uso
Aluno aluno = new Aluno("Maria", "Bolsista");
aluno.inserirNota(80);
aluno.inserirNota(70);
aluno.inserirNota(50);

System.out.println(aluno.getNome()); // Maria
System.out.println(aluno.getNota(0)); // 80
System.out.println(aluno.getCoficienteRendimento()); // 66.66...
System.out.println(aluno.getSituacaoFinal()); // Desligado
