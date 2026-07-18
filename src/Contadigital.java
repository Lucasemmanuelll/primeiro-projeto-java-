public class Contadigital {
    private Cliente cliente;
    private double saldo;
    private boolean contaAtiva;

    public Contadigital(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
        this.contaAtiva = true;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public void depositar(double valor) {
        if (valor > 0 && contaAtiva) {
            saldo += valor;
            System.out.println("Deposito feito! Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Deposito invalido. Verifique o valor ou se a conta esta ativa.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo && contaAtiva) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " feito!");
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saque invalido. Saldo atual: R$ " + saldo);
        }
    }

    public void desativarConta() {
        contaAtiva = false;
    }

    public void mostrarDados() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Conta ativa: " + contaAtiva);
    }
}
