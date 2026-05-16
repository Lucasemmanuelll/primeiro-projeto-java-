import java.util.Scanner;
import java.util.ArrayList;
public class Cadastro{
    private String nome;
    private int idade;
    private String cidade;
    private String cpfUsuario;
    private Contadigital conta;

    public Cadastro(String nome,int idade,String cidade,String cpfUsuario, Contadigital conta) {
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
}

    public void Loginusuario(Menu cd){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu CPF para cadastro: ");
        int cpf = sc.nextInt();
        this.cpfUsuario = cpf;

        if(cpfUsuario ==  ){
            //cadastro do usuário armazenado em <arrays>
        }else{
            System.out.println("CPF inexistente, tente se cadastrar.");
        }
    }
    @Override
    public String toString() {
        return "Nome do Cliente: " + this.getNome() + " | " + "idade: " + this.getIdade() + " | " + "CPF: " + this.getCpfUsuario() + " | " + "Cidade: " + this.getCidade();
    }
}