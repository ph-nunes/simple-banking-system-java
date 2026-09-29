# 🏦 Sistema Bancário em Java (Simple Banking System)

Este projeto simula as operações fundamentais de um caixa eletrônico (Core Banking). Ele foi desenvolvido com foco na aplicação prática de boas práticas de Programação Orientada a Objetos (POO) e estruturas de dados em Java.

O objetivo deste sistema é demonstrar o domínio sobre arquitetura de código, encapsulamento de regras de negócio e manipulação de estado em memória.

## 🚀 Funcionalidades

- **Abertura de Conta:** Inicialização segura da conta com nome do titular e saldo inicial.
- **Operações Financeiras:** Validação rigorosa para regras de negócio básicas de saque e depósito.
- **Histórico de Transações (Extrato):** Registro detalhado de todas as operações válidas realizadas na sessão.
- **Menu Interativo (CLI):** Interface de linha de comando fluida para interação do usuário com o sistema.

## 🛠️ Conceitos e Tecnologias Aplicadas

- **Linguagem:** Java puro (Core Java).
- **Paradigma Orientado a Objetos (POO):** 
  - **Encapsulamento:** Proteção do estado da conta e atributos restritos (`private`).
  - **Composição:** A classe `Conta` possui e gerencia uma lista de objetos `Transacao`.
  - **Construtores:** Inicialização segura de instâncias.
- **Estruturas de Dados:** Uso de `Collections` (especificamente `List` e `ArrayList`) para gerenciar o histórico de transações de forma dinâmica.
- **Controle de Versão:** Git e GitHub para versionamento de código e documentação.

## 📂 Estrutura do Projeto

O sistema foi refatorado de um modelo procedural para uma arquitetura baseada em domínio. As classes principais incluem:

- `App.java`: Classe principal (*Main*) responsável por rodar a interface do terminal (CLI) e interagir com o usuário.
- `Conta.java`: Classe de domínio que retém o saldo, o nome do cliente e a lista de transações, contendo as regras de negócio para alterar o saldo.
- `Transacao.java`: Classe que representa o modelo de um evento financeiro (contendo a descrição da operação e o valor).

## 💻 Como Executar o Projeto
1. Certifique-se de ter o Java Development Kit (JDK) instalado na sua máquina.
2. Clone este repositório ou descarregue os ficheiros.
3. Abra a pasta do projeto na sua IDE de preferência (como o VS Code ou IntelliJ).
4. Compile e execute o ficheiro `App.java`.