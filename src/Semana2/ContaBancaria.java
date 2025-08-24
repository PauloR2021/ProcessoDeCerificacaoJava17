package Semana2;

public class ContaBancaria {

    private String nome;
    private String conta;
    private double saldo;
    private String tipoMovimentacao;
    private double valorMovimentado;


    public String consultarSaldo(){

        String frase = "Nome da Conta: "+this.nome+"\n"+
                "Nº Conta: "+this.conta+ "\n"+
                "Saldo: "+this.saldo;

        return frase;
    }

    public void depositar(double valorMovimentado){
        if(valorMovimentado >0){
            saldo += valorMovimentado;
            System.out.println("Deposito Realizado com Sucesso - Saldo Atual R$: "+this.saldo);

        }else{
            System.out.println("Valor inválido para Depositar: R$ "+valorMovimentado);
        }
    }

    public void sacar(double valorMovimentado){
        if(valorMovimentado >0 && valorMovimentado <=saldo){
            saldo -= valorMovimentado;
            System.out.println("Saque Realizado com Sucesso - Saldo Atual R$: "+this.saldo);

        }else{
            System.out.println("Saldo insuficiente ou valor inválido.");
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public double getValorMovimentado() {
        return valorMovimentado;
    }

    public void setValorMovimentado(double valorMovimentado) {
        this.valorMovimentado = valorMovimentado;
    }
}
