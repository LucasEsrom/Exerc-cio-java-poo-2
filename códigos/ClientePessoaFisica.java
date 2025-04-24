package src;

public class ClientePessoaFisica extends Pessoa implements Cadastravel {
    private String cpf;

    public ClientePessoaFisica(String nome, String cpf) {
        super(nome, cpf);
        this.cpf = cpf;
    }

  
    public void cadastrar() {
        System.out.println("Cliente PF cadastrado: " + nome);
    }

   
    public void excluir() {
        System.out.println("Cliente PF excluído: " + nome);
    }

    
    public void exibirDados() {
        System.out.println("Nome: " + nome + " | CPF: " + cpf);
    }
}

