import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Cadastro cadastro = new Cadastro(10);

    public void iniciar() {
        int opcao;

        do {
            System.out.println("""
                    
                    1 - Criar conta
                    2 - Depositar
                    3 - Sacar
                    4 - Mostrar dados
                    5 - Desativar conta
                    0 - Encerrar
                    """);
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    mostrarDados();
                    break;
                case 5:
                    desativarConta();
                    break;
                case 0:
                    System.out.println("Operacao encerrada.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
    }

    private void criarConta() {
        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        if (cadastro.buscarContaPorCpf(cpf) != null) {
            System.out.println("Ja existe uma conta com esse CPF.");
            return;
        }

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf, senha);
        Contadigital conta = new Contadigital(cliente, 0);

        if (cadastro.cadastrarConta(conta)) {
            System.out.println("Conta criada com sucesso.");
        } else {
            System.out.println("Limite de contas atingido.");
        }
    }

    private void depositar() {
        Contadigital conta = pedirContaLogada();

        if (conta != null) {
            System.out.print("Valor do deposito: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            conta.depositar(valor);
        }
    }

    private void sacar() {
        Contadigital conta = pedirContaLogada();

        if (conta != null) {
            System.out.print("Valor do saque: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            conta.sacar(valor);
        }
    }

    private void mostrarDados() {
        Contadigital conta = pedirContaLogada();

        if (conta != null) {
            conta.mostrarDados();
        }
    }

    private void desativarConta() {
        Contadigital conta = pedirContaLogada();

        if (conta != null) {
            conta.desativarConta();
            System.out.println("Conta desativada.");
        }
    }

    private Contadigital pedirContaLogada() {
        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        Contadigital conta = cadastro.buscarContaPorCpf(cpf);

        if (conta != null && conta.getCliente().senhaCorreta(senha)) {
            return conta;
        }

        System.out.println("CPF ou senha invalidos.");
        return null;
    }
}
