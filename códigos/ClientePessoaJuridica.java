package src;

public class ClientePessoaJuridica extends Pessoa implements Cadastravel {
    private String cnpj;

    public ClientePessoaJuridica(String nome, String cnpj) {
        super(nome, cnpj);
        this.cnpj = cnpj;
    }

    
    public void cadastrar() {
        System.out.println("Cliente PJ cadastrado: " + nome);
    }

    
    public void excluir() {
        System.out.println("Cliente PJ excluído: " + nome);
    }

    
    public void exibirDados() {
        System.out.println("Nome: " + nome + " | CNPJ: " + cnpj);
    }
}

