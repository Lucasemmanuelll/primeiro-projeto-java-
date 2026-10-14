import java.util.ArrayList;
public class CadastroDeClientes {

    Map<String, Cliente> clientes = new HashMap<>();

    private ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }

    public void listaDosCadastrados() {
        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente);
        }
    }

    public Cliente buscarCpf(String cpf) {
            if(clientes.containsKey(cpf)) {
                return clientes.get(cpf);
            }else{
                System.out.println("CPF inexistente");
                return null;
            }
        }
        return null;
        //MAP E SET EM CADA CLIENTE CADASTRADO
    }
    }

