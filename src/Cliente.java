public class Cliente {
// Métodos de logar: senha e cpf?
//class cliente para logar ou para armazenar clientes em arrays?
//criar class login somente para logar?

    private String nome;
    private int idade;
    private String cidade;
    private String cpf;

    public Cliente(
            String nome,
            int idade,
            String cidade,
            String cpf
    ) {

        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.cpf = cpf;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void Loginusuario(int cpf, int senha){
        System.out.println("Digite seu CPF de acesso: ");
        int cpf = sc.nextInt();
        System.out.println("Digite sua SENHA de acesso: ");
        int senha = sc.nextInt();
        cpfUsuario = cpf;
        loginSenha = senha;
        if(cpfUsuario ==  ){//cadastro do usuário armazenado

        }else{
            System.out.println("CPF inexistente, tente se cadastrar.");// + class cadastro
        }
    }

    @Override
    public String toString() {
        return "Nome do Cliente: " + this.getNome() + " | " + "idade: " + this.getIdade() + " | " + "CPF: " + this.getCpf() + " | " + "Cidade: " + this.getCidade();
    }
}