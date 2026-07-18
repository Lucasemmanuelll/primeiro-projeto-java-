public class Cadastro {
    private Contadigital[] contas;
    private int totalContas;

    public Cadastro(int quantidadeMaxima) {
        contas = new Contadigital[quantidadeMaxima];
        totalContas = 0;
    }

    public boolean cadastrarConta(Contadigital conta) {
        if (totalContas == contas.length) {
            return false;
        }

        contas[totalContas] = conta;
        totalContas++;
        return true;
    }

    public Contadigital buscarContaPorCpf(String cpf) {
        for (int i = 0; i < totalContas; i++) {
            if (contas[i].getCliente().getCpf().equals(cpf)) {
                return contas[i];
            }
        }

        return null;
    }
}
