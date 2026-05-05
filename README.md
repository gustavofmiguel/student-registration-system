# 📋 Sistema de Cadastro de Alunos

Projeto desenvolvido como exercício prático. O objetivo é aplicar os fundamentos de Orientação a Objetos e estruturas de dados em Java construindo um sistema de cadastro de alunos no terminal.

---

## 📌 Sobre o projeto

O sistema permite cadastrar alunos com nome, matrícula e duas notas, calcular a média automaticamente e exibir a situação de cada aluno (Aprovado, Recuperação ou Reprovado). Tudo funciona via menu interativo no console, sem frameworks ou banco de dados, puro Java.

```
=== MENU ===
1 - Cadastrar aluno
2 - Listar todos
3 - Buscar por nome
4 - Buscar por matricula
0 - Sair
```
## 🔍 Funcionalidades

- [x] Cadastrar aluno (nome, matrícula, nota 1 e nota 2)
- [x] Listar todos os alunos com média e situação formatados em tabela
- [x] Buscar aluno por nome (busca parcial, sem case-sensitive)
- [x] Validação de capacidade máxima do array
- [x] Cálculo automático de média e situação

---
Exemplo de saída

```
Idx   Nome                 Matrícula    Média    Situação
-------------------------------------------------------
[1 ] Ana Souza             1001         8.5      Aprovado
[2 ] Bruno Lima            1002         5.8      Recuperação
[3 ] Carla Melo            1003         3.8      Reprovado
```
## 🧠 Conceitos praticados
 
- Classes, construtores e encapsulamento
- Arrays com tamanho fixo e controle por índice
- Referências e instâncias com `new`
- Formatação de saída com `printf`
- Leitura de entrada com `Scanner`
