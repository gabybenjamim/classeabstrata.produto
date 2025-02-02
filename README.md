# Projeto de Classe Abstrata em Java

Este projeto é um exemplo de uso de **classe abstrata** em Java, utilizando Programação Orientada a Objetos (POO). O objetivo é demonstrar como classes abstratas podem ser utilizadas para modelar entidades com comportamentos comuns, mas com implementações específicas.

---

## Descrição do Projeto

O projeto modela dois tipos de produtos:

1. **Produto Físico**:
   - Representa produtos tangíveis, como livros ou jogos físicos.
   - Possui atributos como `nome` e `preco`.

2. **Produto Digital**:
   - Representa produtos intangíveis, como e-books ou jogos digitais.
   - Possui atributos como `nome` e `preco`.

Ambos os tipos de produtos herdam de uma **classe abstrata** chamada `Produto`, que define o comportamento comum, como o método `toString()` para exibir informações do produto.

---

## Como Executar o Projeto

Para executar este projeto, você precisa ter o Java Development Kit (JDK) instalado em seu computador.

1. Clone este repositório (ou copie o código para um arquivo `ProdutoTeste.java`).
2. Compile o arquivo `ProdutoTeste.java` usando o comando:
3. 
   ```bash
   javac ProdutoTeste.java
