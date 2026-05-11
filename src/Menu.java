import java.util.Scanner;
public class Menu {
    Scanner sc = new Scanner(System.in);
    private int cpfUsuario;
    private double loginSenha;

    public Menu(int cpfUsuario,double loginSenha){
        this.loginSenha = loginSenha;
        this.cpfUsuario = cpfUsuario ;
    }
    public int getCpfusuario(){
        return cpfUsuario;
    }
    public double getLoginSenha(){
        return loginSenha;
    }
                public void setCpfUsuario(int cpfUsuario){

                        this.cpfUsuario= cpfUsuario;
                }
                public void setLoginSenha(double loginSenha){

                        this.loginSenha = loginSenha;
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
        public void Cadastrousuario(){//como cadastrar os usuários?

        }
//1 - Criar conta: nome de acesso e senha.
//2 - Depositar
//3 - Sacar
//4 - Mostrar dados
//5 - Encerrar

    public  void mostrarDadosmenu(){
        System.out.println ("Quais das opções deseja acessar: ");
        System.out.println ("""
            1- para Depositar.
            2- para Sacar.
            3- para Mostrar dados
            4- Encerrar operação.
            """);
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                System.out.println(cd.mostrarDados());
                break;
            case 2:
                System.out.println(cd.sacar());
                break;
            case 3://array listy dos clientes(cliente específico) seus dados de depósito, saques e tipo de conta + titular
            break;
            case 4:
                System.out.println("Operação encerrada.");
                break;
        }
    }
    }

