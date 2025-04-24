# Projeto Java – Cadastro de Clientes

Este projeto foi desenvolvido como atividade da disciplina de Programação Orientada a Objetos. A proposta era aplicar conceitos como herança, classes abstratas, interfaces, polimorfismo e tratamento de exceções em um sistema simples.

## Alunos
- Lucas Esrom Pinto de Oliveira  
- Gabriel Oliveira dos Santos

## Sobre o Projeto

O sistema criado simula um cadastro de clientes, podendo ser pessoa física (com CPF) ou pessoa jurídica (com CNPJ). O objetivo foi praticar a estruturação de classes em Java, usando os conceitos que aprendemos nas aulas até agora.

## Estrutura do Código

- **Pessoa**: classe abstrata que define atributos básicos como nome e documento.
- **ClientePessoaFisica**: herda de Pessoa e representa clientes com CPF.
- **ClientePessoaJuridica**: também herda de Pessoa e representa clientes com CNPJ.
- **Cadastravel**: interface com os métodos cadastrar e excluir.
- **Main**: classe principal onde o programa roda, com exemplo de cadastro e validação de dados.

## O que foi usado

- **Herança**: entre Pessoa e seus tipos de clientes.
- **Classe Abstrata**: Pessoa, que não pode ser instanciada diretamente.
- **Interface**: Cadastravel, que garante que os métodos sejam implementados.
- **Polimorfismo**: com o método `exibirDados`, que funciona diferente dependendo da classe.
- **Exceções**: usamos tratamento de erro na validação do CPF (como verificar se tem só números e 11 dígitos).

## Como testar

O código pode ser executado no Eclipse. Basta rodar a classe Main e seguir as instruções no terminal. O programa solicita os dados e valida o CPF. Se for digitado errado (como letras ou menos de 11 dígitos), aparece uma mensagem de erro.

## Observações

O foco do trabalho foi mais na lógica e estrutura das classes do que em fazer uma interface visual ou um sistema completo de banco de dados. O projeto está separado em arquivos diferentes para facilitar a organização e a leitura.




