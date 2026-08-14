public class Main {
    public static void main (String[]args) {
        CadastroDeClientes cadastro = new CadastroDeClientes();
        Menu menu = new Menu(cadastro);

        menu.exibirMenu();
    }
}