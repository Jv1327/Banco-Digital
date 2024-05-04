// Classe ContaPoupanca - representa uma conta poupança, herda de Conta
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numeroConta, double taxaRendimento) {
        super(numeroConta);
        this.taxaRendimento = taxaRendimento;
    }

    // Implementar métodos específicos da conta poupança, se necessário
}
