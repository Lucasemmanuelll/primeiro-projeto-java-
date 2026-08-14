import java.util.Scanner;
public class Menu {

    private CadastroDeClientes cadastro;

    Scanner ler = new Scanner(System.in);

    //método construtor da classe
    public
    Menu(CadastroDeClientes cadastro){
        this.cadastro = cadastro;
    }

    public void exibirMenu(){
        System.out.println("-----------Menu----------");
        System.out.println("1 – Cadastrar");
        System.out.println("2 – Login");
        System.out.println("3 – Sair");

        int opcao = ler.nextInt();
        switch(opcao) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                loginusuario();
                break;
            case 3:
                System.out.println("Saindo...");
                break;
        }
    }

    public void loginusuario(){
        System.out.println("Digite seu CPF para cadastro: ");
        String cpf = ler.next();
        Cliente buscado = cadastro.buscarCpf(cpf);
        if(buscado != null){
            System.out.println("Seja bem-vindo " + buscado.getNome() + " ! ");
        }else{
            System.out.println("CPF inexistente, tente se cadastrar.");
        }
    }

    public void cadastrarCliente(){
        System.out.println("Seu nome: ");
        String nome = ler.next();
        System.out.println("Sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Sua cidade: ");
        String cidade = ler.next();
        System.out.println("Digite seu CPF: ");
        String cpf = ler.next();

        Contadigital conta = new Contadigital(nome, 0.0, true);
        Cliente cadastrado = new Cliente(nome, idade, cidade, cpf, conta);
        cadastro.adicionarCliente(cadastrado);
        System.out.println("Você foi Cadastrado!");

    }
}