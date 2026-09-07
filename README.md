# boas-praticas-software

Atividade prática da disciplina **Manutenção e Configuração de Software** — Normas de Configuração, Boas Práticas e Git.

## Estrutura

```
src/Sistema.java
```

## Como executar

```
javac -d bin src/Sistema.java
java -cp bin Sistema
```

Saída esperada:

```
Aluno: Carlos
Media: 7.5
Situacao: Aprovado
```

## Histórico do projeto

- Branch `main`: contém a versão inicial do sistema, recebida sem alterações.
- Branch `melhoria-boas-praticas`: contém a versão refatorada, aplicando boas práticas (depois integrada à `main` via Pull Request).

## Questão final

**1. Qual era o principal problema do código original?**

O código funcionava, mas era pouco legível e mal organizado: usava nomes de variáveis sem significado (`n`, `a`, `b`, `c`), colocava toda a lógica dentro do método `main` sem nenhuma separação de responsabilidades e não seguia nenhum padrão de nomenclatura, o que dificultava entender o que cada parte do programa fazia só de olhar para o código.

**2. Quais melhorias você realizou?**

- Troquei os nomes das variáveis por nomes descritivos (`nomeAluno`, `notaProva1`, `notaProva2`, `media`, `situacaoAluno`).
- Dividi o programa em métodos com responsabilidade única: `calcularMedia`, `verificarSituacao` e `exibirResultado`.
- Substituí o número mágico `6` por uma constante nomeada, `MEDIA_MINIMA_APROVACAO`.
- Padronizei a nomenclatura (classes em PascalCase, métodos e variáveis em camelCase), a indentação e a organização do arquivo.
- Adicionei comentários curtos (Javadoc) apenas onde ajudam a explicar a intenção de cada método, sem poluir o código.

**3. Como a modularização facilitou a organização do código?**

Separar o cálculo da média, a verificação da situação do aluno e a exibição do resultado em métodos distintos fez com que cada trecho do programa tivesse uma única responsabilidade. Isso torna o código mais fácil de ler (o `main` passou a descrever o fluxo geral em poucas linhas), mais fácil de testar isoladamente e mais fácil de manter — se a regra de aprovação mudar, por exemplo, só é preciso alterar o método `verificarSituacao`, sem mexer no restante do programa.

**4. Como o Git ajudou a controlar as alterações realizadas no sistema?**

O Git permitiu registrar cada etapa da evolução do sistema de forma isolada e reversível: o commit inicial preservou a versão original do código como referência, e a criação da branch `melhoria-boas-praticas` permitiu aplicar as melhorias sem afetar a versão estável na `main`. O histórico de commits documenta exatamente o que mudou e por quê, e o Pull Request permitiu revisar todas as alterações antes de integrá-las à `main` através do merge, tornando o processo transparente e rastreável.
