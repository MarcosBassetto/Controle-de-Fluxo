📋 Desafio Controle de Fluxo
Visão Geral

Este projeto consiste em uma aplicação Java simples que solicita ao usuário dois parâmetros numéricos e realiza uma contagem a partir do primeiro parâmetro até o segundo. Se o primeiro parâmetro for maior ou igual ao segundo, uma exceção personalizada é lançada.
Estrutura do Projeto

plaintext

desafioControleFluxo/
├── src/
│   └── main/
│       └── java/
│           └── desafioControleFluxo/
│               ├── Contador.java
│               └── ParametrosInvalidosException.java
└── README.md

📌 Funcionalidades
Entrada de Dados:

    O programa solicita ao usuário que insira dois números inteiros: parametroUm e parametroDois.

Validação e Contagem:

    Se parametroUm for menor que parametroDois, o programa realiza uma contagem do zero até a diferença entre parametroDois e parametroUm.
    Se parametroUm for maior ou igual a parametroDois, uma exceção personalizada (ParametrosInvalidosException) é lançada.

Tratamento de Exceção:

    A exceção personalizada exibe uma mensagem de erro quando parametroUm é maior ou igual a parametroDois.

💻 Requisitos

    JDK 8 ou superior
    IDE Java (opcional, recomendado: Eclipse ou IntelliJ IDEA)

📜 Conclusão

Este projeto é uma introdução ao controle de fluxo em Java e ao uso de exceções personalizadas para validação de parâmetros. É um exemplo simples, mas eficaz, para entender como estruturar programas em Java e lidar com entradas de usuário e possíveis erros.
