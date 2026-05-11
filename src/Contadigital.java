public class Contadigital {
    private String titular;
    private double saldo;
    private boolean contaAtiva;

    public Contadigital (String titular, double saldo, boolean contaAtiva){
        this.titular = titular;
        this.saldo = saldo;
        this.contaAtiva = true;
    }

    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean getContaAtiva(){
        return contaAtiva;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(double saldo){
        if(saldo > 0 ){
            this.saldo = saldo;
        }
    }
    public void setContaAtiva(boolean contaAtiva){
        this.contaAtiva = contaAtiva;
    }
    public void depositar(double valor ){
        if(contaAtiva){
            System.out.println("Depósito feito!");
        }else{
            System.out.println("Processo de depósito inválido, conta desativada ou saldo negativo.");
        }
    }
    public void sacar( double saldoSuficiente){

        if(saldoSuficiente <= saldo || contaAtiva == true){
            System.out.println("Saque de" +saldoSuficiente+ " feito!");
        }else{
            System.out.println("Valor de saque insuficiente para: " +saldo);
        }
    }
    public void desativarConta(){
        contaAtiva = false;
    }

    public void mostrarDados(){
        System.out.println("Titular: " +titular+ "| Saldo: " +saldo+ "| Conta ativa: " +contaAtiva);
    }
}

