package desafio.banco_digital;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setNome("Robson");

    Conta cc = new ContaCorrente(cliente);
    cc.depositar(100);

    Conta cp = new ContaPoupanca(cliente);
    cc.transferir(50, cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
  }
}
