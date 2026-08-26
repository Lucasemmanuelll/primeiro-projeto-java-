public class Cliente{
    private String nome;
    private int idade;
    private String cidade;
    private String cpfUsuario;
    private Contadigital conta;

    public Cliente(String nome,int idade,String cidade,String cpfUsuario, Contadigital conta) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.cpfUsuario = cpfUsuario;
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + this.getNome() + " | " + "idade: " + this.getIdade() + " | " + "CPF: " + this.getCpfUsuario() + " | " + "Cidade: " + this.getCidade() + " | " + "Conta ativa: " + conta.getContaAtiva();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public Contadigital getConta() {
        return conta;
    }

    public void setConta(Contadigital conta) {
        this.conta = conta;
    }
    public void mostrarDados() {
        System.out.println("Titular: " + getNome());
        System.out.println("CPF: " + getCpfUsuario());
        System.out.println("Saldo: R$ " + getConta().getSaldo());
        System.out.println("Conta ativa: " + getConta().getContaAtiva());
    }
}