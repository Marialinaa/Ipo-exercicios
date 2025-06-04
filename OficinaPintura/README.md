# Projeto Oficina de Pintura

## Descrição
Este projeto simula o sistema de gerenciamento de uma oficina de pintura, permitindo a criação de orçamentos baseados em diferentes tipos de pintura e efeitos adicionais.

## Funcionalidades
- Seleção do tipo de pintura base (Automotiva, Predial ou Artística)
- Adição de efeitos especiais à pintura (Brilho, Textura, Verniz)
- Remoção de efeitos adicionados
- Cálculo automático do tempo estimado para realizar o serviço
- Geração de orçamento detalhado

## Estrutura de Classes

### Classe Pintura
Responsável por armazenar as informações sobre uma pintura:
- Tipo de pintura base
- Lista de códigos de efeitos adicionados
- Métodos para manipular os efeitos (adicionar, remover, consultar)

### Classe MenuOficina
Implementa a interface com o usuário através de um menu de console:
- Cadastro da pintura base
- Gerenciamento de efeitos
- Exibição do orçamento
- Navegação entre opções

### Classe AppOficina
Classe principal que inicia o programa

## Como Usar
1. Execute o programa através da classe `AppOficina`
2. Selecione o tipo de pintura base desejado
3. Utilize o menu para adicionar ou remover efeitos
4. Visualize o orçamento de tempo para realizar o serviço
5. Encerre o programa quando finalizar

## Exemplo de Uso
```
### Selecione o tipo de pintura base:
0 - Automotiva (6.0 horas)
1 - Predial (5.0 horas)
2 - Artística (8.0 horas)
Escolha o índice da pintura base: 0
Pintura criada com base: Automotiva

######## Menu de Opções ########
1. Adicionar Efeito
2. Remover Efeito
3. Exibir Orçamento de Tempo
4. Sair
Escolha uma opção: 1

Efeitos disponíveis:
0 - Brilho (+0.5 horas)
1 - Textura (+1.5 horas)
2 - Verniz (+1.0 horas)
Escolha o índice do efeito a adicionar: 0
Efeito "Brilho" adicionado.
```

## Requisitos do Sistema
- Java 8 ou superior
- Console/Terminal para execução

## Estrutura do Projeto
- `src`: Contém os arquivos-fonte do projeto
  - `Pintura.java`: Classe que representa uma pintura
  - `MenuOficina.java`: Classe que implementa a interface de usuário
  - `AppOficina.java`: Classe principal
- `bin`: Contém os arquivos compilados
- `.vscode`: Configurações do Visual Studio Code
