//1 - Criar conta: nome de acesso e senha.
//2 - Depositar
//3 - Sacar
//4 - Mostrar dados
//5 - Encerrar

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
        if(cpfUsuario == ){//cadastro do usuário armazenado

        }else{
            System.out.println("CPF inexistente, tente se cadastrar."// + class cadastro  );
        }
    }
        public void Cadastrousuario(){

        }
    }

    public  void mostrarDados(){
        System.out.println ("""
                CPF de Acesso: 
                Senha de Acesso: 
                """);
    }
}
