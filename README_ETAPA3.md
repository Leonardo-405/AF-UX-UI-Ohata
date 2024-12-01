# Controle do Fluxo do Código - Etapa 3

Este arquivo apresenta os pontos-chave do controle de fluxo, calcula a complexidade ciclomática e detalha os possíveis caminhos no código analisado.

---

![Diagrama](https://lucid.app/lucidchart/ae4bdcce-c7cb-4ffb-bfbe-d856bf28cd38/edit?invitationId=inv_359f21bc-c557-4e1e-9737-0e8fb9d418f6&page=0_0#)

---

## Detalhamento dos Pontos

### **Método conectarBD**

1. **N1**: Ponto inicial do método `conectarBD`.
2. **N2**: Inicialização do objeto `Connection` como `null`.
3. **N3**: Entrada no bloco `try`.
4. **N4**: Carregamento do driver MySQL com `Class.forName`.
5. **N5**: Configuração da URL para conexão com o banco de dados.
6. **N6**: Criação da conexão via `DriverManager.getConnection`.
7. **N7**: Entrada no bloco `catch` ao capturar uma exceção.
8. **N8**: Retorno da conexão, seja um objeto válido ou `null`.

### **Método verificarUsuario**

9. **N9**: Ponto inicial do método `verificarUsuario`.
10. **N10**: Definição da consulta SQL e chamada ao método `conectarBD`.
11. **N11**: Construção dinâmica da consulta SQL com `login` e `senha`.
12. **N12**: Entrada no bloco `try`.
13. **N13**: Execução da consulta SQL e armazenamento dos resultados.
14. **N14**: Avaliação condicional (`if`) para verificar a existência de resultados.
15. **N15**: Atribuição de valores às variáveis `result` e `nome`, caso haja correspondência.
16. **N16**: Entrada no bloco `catch` ao capturar uma exceção.
17. **N17**: Retorno do resultado com base nos cenários:
    - Falha (exceção ou conexão não estabelecida).
    - Sem correspondência (nenhum resultado).
    - Sucesso (resultado encontrado).

---

## Complexidade Ciclomática

A complexidade ciclomática é determinada pela fórmula:  

- **E**: Número de arestas no grafo.
- **N**: Número de nós no grafo.
- **P**: Número de componentes conectados (neste caso, 1).

### Cálculo
- Nós (N): 17.
- Arestas (E): 19 (conexões mapeadas no grafo).
- Componentes conectados (P): 1.

M = 19 - 17 + 2 * 1 = 4 ``


A complexidade ciclomática é **4**, indicando 4 caminhos únicos.

---

## Caminhos Mapeados

### Método conectarBD
1. Caminho 1: N1 → N2 → N3 → N4 → N5 → N6 → N8.
2. Caminho 2: N1 → N2 → N3 → N7 → N8.

### Método verificarUsuario
1. Caminho 1: N9 → N10 → N11 → N12 → N13 → N14 → N15 → N17 (sucesso).
2. Caminho 2: N9 → N10 → N11 → N12 → N13 → N14 → N17 (sem correspondência).
3. Caminho 3: N9 → N10 → N11 → N12 → N16 → N17 (falha).

---

## Conclusão

O código possui 4 caminhos distintos, evidenciando um fluxo bem estruturado e controlado. A complexidade ciclomática moderada permite que o código seja compreendido, mantido e testado com eficiência.


