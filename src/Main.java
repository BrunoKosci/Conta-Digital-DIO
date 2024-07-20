public class Main {

    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");

        Conta cc = new ContaCorrente(bruno);

        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(bruno);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
