public class Contadigital {
    private double saldoInicial;
    private boolean contaAtiva;

    //CONSTRUTOR
    public Contadigital( double saldo) {
        this.saldo = saldo;
        this.contaAtiva = true;
    }

    // GET E SET ( SALDO , CONTA ATIVA)
    public double getSaldo() {
        return saldo;
    }

    public boolean getContaAtiva() {
        return contaAtiva;
    }

    //METODO DEPOSITAR
    public void depositar(double valor) {
        if (valor > 0 && contaAtiva) {
            saldo += valor;
            System.out.println("Deposito feito! Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Deposito invalido. Verifique o valor ou se a conta esta ativa.");
        }
    }

    //METODO SACAR
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo && contaAtiva) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " feito!");
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saque invalido. Saldo atual: R$ " + saldo);
        }
    }

    //METODO ESTADO DA CONTA
    public void desativarConta() {
        contaAtiva = false;
    }

}
