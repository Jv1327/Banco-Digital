// Classe principal para testar o funcionamento
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(1, 1000.0);
        ContaPoupanca cp1 = new ContaPoupanca(2, 0.05);

        cc1.depositar(500.0);
        cp1.depositar(1000.0);

        System.out.println("Saldo conta corrente: " + cc1.getSaldo());
        System.out.println("Saldo conta poupança: " + cp1.getSaldo());

        cc1.transferir(cp1, 200.0);

        System.out.println("Saldo conta corrente após transferência: " + cc1.getSaldo());
        System.out.println("Saldo conta poupança após transferência: " + cp1.getSaldo());
    }
}