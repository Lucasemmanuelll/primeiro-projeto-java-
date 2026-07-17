public class Contadigital {
    private String titular;
    private double saldo;
    private boolean contaAtiva;

    public Contadigital(String titular, double saldo, boolean contaAtiva) {
        this.titular = titular;
        this.saldo = saldo;
        this.contaAtiva = contaAtiva;
    }

    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public boolean getContaAtiva() {
        return contaAtiva;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public void depositar(double valor) {
        if (valor > 0 && contaAtiva) {
            System.out.println("Depósito feito!" + (valor + saldo));
            this.saldo = saldo + valor;
        } else {
            System.out.println("Processo de depósito inválido, conta desativada ou saldo negativo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo && contaAtiva) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " feito!");
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de saque insuficiente para: " + saldo);
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
