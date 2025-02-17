# Controle de Fluxo

Este é um aplicativo simples em Java que demonstra conceitos de controle de fluxo e tratamento de exceções. A aplicação solicita que o usuário insira dois números inteiros e, a partir deles, executa uma contagem com base na diferença entre esses números.

## Conceitos exercitados

- **Entrada de dados:** Solicita dois números inteiros do usuário.
- **Validação de parâmetros:** Verifica se o primeiro número não é maior que o segundo. Caso essa condição seja atendida, lança uma exceção customizada (`ParametrosInvalidosException`).
- **Tratamento de exceções:** Trata entradas inválidas (como valores não numéricos) e a lógica de parâmetros incorretos, permitindo que o usuário insira os dados novamente.
- **Contagem:** Calcula a diferença entre o segundo e o primeiro parâmetro e imprime uma sequência numérica de 1 até essa diferença.