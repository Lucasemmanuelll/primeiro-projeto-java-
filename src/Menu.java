//1 - Criar conta: nome de acesso e senha.
//2 - Depositar
//3 - Sacar
//4 - Mostrar dados
//5 - Encerrar
import java.util.Scanner;
public class Menu {
    Scanner sc = new Scanner(System.in);

    private int cpfUsuario;
    private String titular;

    public Menu(int cpfUsuario, String titular){
        this.cpfUsuario = cpfUsuario ;
        this.titular = titular;
    }
    public int getCpfusuario(){
        return cpfUsuario;
    }
    public String getTitular(){
        return titular;
    }
                public void setCpfUsuario(int cpfUsuario){

                        this.cpfUsuario= cpfUsuario;
                }
                public void setTitular(String titular){
                        this.titular = titular;
                }

    public  void mostrardadosmenu(Contadigital cd){
        System.out.println("Digite seu CPF para logar com sua conta:");
        int cpfUsuario = sc.nextInt();

        if(cpfUsuario == ){//se cpf do usuário for encontrado, mostrar opçoes do Switch
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
                    System.out.println(cd.depositar(5000));
                    break;
                case 2:
                    System.out.println(cd.sacar(2000));
                    break;
                case 3:
                    System.out.println(cd.mostrardadosmenu());//array listy dos clientes(cliente específico) seus dados de depósito, saques e tipo de conta + titular
                    break;
                case 4:
                    System.out.println(cd   .desativarConta());
                    System.out.println("Operação encerrada.");
                    break;
            }
        }else{
            System.out.println(cd.Loginusuario());
        }

    }
    }

