package interfaceGrafica;


public class ContaCorrente {

    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = 0;
    }

    public Double depositar(double valorDeposito) {
        this.saldo = saldo += valorDeposito;
        return saldo;
    }

    public Double sacar(double valorSaque) {
        this.saldo = saldo -= valorSaque;
        return saldo;
    }
    
    //caso o metodo modificarSaldo funcione esse não será necessário
    public double parseDouble (String string) {
        double stringForDouble = Double.parseDouble(string);
        return stringForDouble;
    }
    
    public double modificarSaldoDeposito (String saldoValor, String inputDepositar, double modificaSaldo ) {
        double saldoValorDouble = Double.parseDouble(saldoValor);
        double inputDepositarDouble = Double.parseDouble(inputDepositar);
        modificaSaldo = this.depositar(inputDepositarDouble);
        
        return modificaSaldo;
    }
    
    public double modificarSaldoSaque (String saldoValor, String inputSacar, double modificaSaldo ) {
        double saldoValorDouble = Double.parseDouble(saldoValor);
        double inputSacarDouble = Double.parseDouble(inputSacar);
        modificaSaldo = this.sacar(inputSacarDouble);
        
        return modificaSaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

}
