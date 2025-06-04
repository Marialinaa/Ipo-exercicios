# Sistema de Contas Bancárias

Este projeto implementa um sistema simples de contas bancárias em Java, desenvolvido como parte dos estudos da Aula 7.

## Funcionalidades

O sistema permite:
- Criar contas bancárias com nome de titular
- Realizar depósitos em contas
- Realizar saques de contas
- Visualizar dados das contas
- Controlar a quantidade total de contas criadas

## Estrutura do Projeto

O projeto é composto por duas classes principais:
- `ContaBancaria`: Implementa a lógica de uma conta bancária
- `App`: Classe principal que demonstra o uso das contas bancárias

## Como Executar

1. Certifique-se de ter o JDK instalado em seu sistema
2. Compile as classes com `javac src/*.java -d bin`
3. Execute o programa com `java -cp bin App`
4. Siga as instruções no console para criar contas, fazer depósitos e saques

## Detalhes Técnicos

- O projeto usa `Scanner` para entrada de dados pelo usuário
- A classe `ContaBancaria` mantém um contador estático do número de contas criadas
- O saldo é atualizado apenas quando operações válidas são realizadas

## Estrutura de Pastas

- `src`: Código-fonte do projeto
- `bin`: Arquivos compilados (gerados automaticamente)
- `lib`: Bibliotecas externas (se necessário)

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
