public class ContaCorrente extends Conta {

private double limite;

public double getLimite(){
    return this.limite;
}

public void setLimite(double limite){
    this.limite = limite;
}

@Override
    boolean sacar(double valor) {
        if (valor > this.saldo + this.limite) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

}