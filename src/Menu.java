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

