# Cadastro de Clientes – Projeto Java POO

Projeto desenvolvido como parte da disciplina de Programação Orientada a Objetos (POO), utilizando os conceitos fundamentais de Java, como classes, herança, interfaces, classes abstratas, polimorfismo e tratamento de exceções.

## Desenvolvedores
- Lucas Esrom Pinto de Oliveira  
- Gabriel Oliveira dos Santos

---

## Descrição da Solução

Este sistema simula o cadastro de clientes Pessoa Física e Pessoa Jurídica, permitindo exibir seus dados e validar informações como CPF e CNPJ. O programa foi construído com foco em aplicar os conceitos aprendidos em aula de forma clara e organizada.

---

## Estrutura do Projeto

- `Pessoa` (classe abstrata):  
  Define os atributos comuns (nome, documento) e exige que as subclasses implementem o método `exibirDados()`.

- `ClientePessoaFisica` (subclasse de `Pessoa`):  
  Representa um cliente com CPF. Implementa a interface `Cadastravel`.

- `ClientePessoaJuridica` (subclasse de `Pessoa`):  
  Representa um cliente com CNPJ. Também implementa a interface `Cadastravel`.

- `Cadastravel` (interface):  
  Define o contrato com os métodos `cadastrar()` e `excluir()`.

- `Main`:  
  Classe principal com menu interativo. Permite cadastrar um cliente PF, validar CPF e exibir os dados cadastrados.

---

## Conceitos Aplicados

| Conceito                  | Aplicação no Projeto |
|---------------------------|----------------------|
| Classe e Objeto           | Instância de clientes no `Main` |
| Herança                   | `ClientePessoaFisica` e `ClientePessoaJuridica` herdam de `Pessoa` |
| Classe Abstrata           | `Pessoa` serve como base para as subclasses |
| Interface                 | `Cadastravel` define o contrato dos métodos `cadastrar()` e `excluir()` |
| Polimorfismo              | `exibirDados()` é sobrescrito de formas distintas |
| Tratamento de Exceções    | Validação do CPF com regex e `try/catch` |

---

## Como Executar

1. Clone o repositório ou importe o projeto no Eclipse.
2. Execute o arquivo `Main.java`.
3. Siga as instruções no terminal para cadastrar um cliente Pessoa Física.

---

## Validação de CPF

O CPF digitado deve conter exatamente 11 números. Letras, espaços ou símbolos geram erro com a seguinte mensagem:


