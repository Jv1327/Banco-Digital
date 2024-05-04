public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, double limiteChequeEspecial) {
        super(numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Implementar métodos específicos da conta corrente, se necessário
}