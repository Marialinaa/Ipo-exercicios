# Sistema de Gerenciamento de Itens

Este projeto implementa um sistema de gerenciamento de itens de mídia, como CDs e DVDs, utilizando conceitos de herança em Java.

## Descrição do Projeto

O sistema permite cadastrar, armazenar e visualizar informações sobre diferentes tipos de mídias (CDs e DVDs) que herdam características da classe base `Item`.

### Classes Principais

- **Item**: Classe base que contém atributos comuns como título, tempo de reprodução e status de posse.
- **CD**: Classe que herda de Item e adiciona atributos específicos como artista e número de faixas.
- **DVD**: Classe que herda de Item e adiciona atributos específicos como ano, gênero e diretor.
- **GerenciamentoItem**: Classe responsável por gerenciar a coleção de itens.
- **App**: Classe principal com o menu interativo para utilização do sistema.

## Funcionalidades

- Cadastrar CDs com suas informações específicas
- Cadastrar DVDs com suas informações específicas
- Exibir todos os itens cadastrados com seus detalhes

## Como Utilizar

1. Execute a classe `App` para iniciar o programa
2. Escolha uma opção no menu:
   - Opção 1: Cadastrar um novo CD
   - Opção 2: Cadastrar um novo DVD
   - Opção 3: Exibir todos os itens cadastrados
   - Opção 0: Sair do programa

## Estrutura de Pastas

- `src/`: Contém todos os arquivos fonte Java
  - `Item.java`: Implementação da classe base
  - `Cd.java`: Implementação da classe para CDs
  - `Dvd.java`: Implementação da classe para DVDs
  - `GerenciamentoItem.java`: Implementação do gerenciador de itens
  - `App.java`: Implementação do programa principal com interface de usuário
- `bin/`: Contém os arquivos compilados (gerados automaticamente)

## Exemplo de Uso

Ao executar o programa, você verá um menu interativo que permite adicionar CDs e DVDs à coleção.
Para cada item, você fornecerá informações como título, tempo de reprodução, se você possui o item, e dados específicos do tipo de mídia.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
