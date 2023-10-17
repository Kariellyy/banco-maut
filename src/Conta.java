public class Conta {
    private String agencia;
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(String agencia, int numeroConta, double saldo, Cliente cliente){
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
