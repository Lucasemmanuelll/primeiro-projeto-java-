import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class CadastroDeClientes {

    Map<String, Cliente> clientes = new HashMap<>();

    public void listaDosCadastrados() {
        for (Map.Entry<String, Cliente> cliente : clientes.entrySet()) {
            System.out.println(cliente.getKey() + " - " + cliente.getValue().getNome());
        }
    }

    public void adicionarCliente(Cliente cliente) {
        if(!clientes.containsKey(cliente.getCpfUsuario())) {
            clientes.put(cliente.getCpfUsuario(), cliente);
        }else {
            System.out.println("CPF já cadastrado.");
        }
    }

    public void listaDosCadastrados() {
        for (Map.Entry<String, Cliente> cliente : clientes.entrySet()) {
            System.out.println(cliente.getKey() + " - " + cliente.getValue().getNome());
        }
    }

    public Cliente buscarCpf(String cpf) {
        if (clientes.containsKey(cpf)) {
            return clientes.get(cpf);
        } else {
            System.out.println("CPF inexistente");
            return null;
        }
    }



}

