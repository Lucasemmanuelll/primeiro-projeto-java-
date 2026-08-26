import java.util.ArrayList;
public class CadastroDeClientes {

    private ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }

    public void listaDosCadastrados() {
        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente);
        }
    }

    public Cliente buscarCpf(String cpfBuscado) {
        for (Cliente cliente : listaDeClientes) {
            if (cpfBuscado.equals(cliente.getCpfUsuario())) {
                return cliente;
            }
        }
        return null;
        //MAP E SET EM CADA CLIENTE CADASTRADO
    }
    }

