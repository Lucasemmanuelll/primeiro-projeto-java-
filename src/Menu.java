import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private CadastroDeClientes cadastro;
    Scanner ler = new Scanner(System.in);

    //metodo construtor da classe
    public Menu(CadastroDeClientes cadastro){
        this.cadastro = cadastro;
    }

        public void exibirMenu() {
            int opcao;
            do {
                System.out.println("-----------Menu----------");
                System.out.println("1 – Cadastrar");
                System.out.println("2 – Login");
                System.out.println("3 – Sair");
                try {
                    opcao = ler.nextInt();
                    switch (opcao) {
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
                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números.");
                    ler.nextLine();
                    opcao = 0;
                }
            } while (opcao != 3);
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

    public void loginusuario() {
        System.out.println("Digite seu CPF para cadastro: ");
        String cpf = ler.next();
        Cliente buscado = cadastro.buscarCpf(cpf);

        if (buscado != null) {
            try {
                System.out.println("Seja bem-vindo " + buscado.getNome() + " ! ");
                System.out.println("""
                    -----------Menu----------" 
                    1 – Consultar saldo.
                    2 – Depositar.
                    3 – Sacar.
                    4 – Sair""");

                int opcao2 = ler.nextInt();

                switch (opcao2) {
                    case 1:
                        System.out.println("Saldo: " + buscado.getConta().getSaldo());
                        break;
                    case 2:
                        System.out.println("Quanto voce quer depositar?");
                        double valorDeposito = ler.nextDouble();
                        buscado.getConta().depositar(valorDeposito);
                        break;
                    case 3:
                        System.out.println("Digite o valor: ");
                        double valorSaque = ler.nextDouble();
                        buscado.getConta().sacar(valorSaque);
                        break;
                    case 4:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números.");
            }
        } else {
            System.out.println("CPF inexistente, tente se cadastrar.");
        }
    }

}