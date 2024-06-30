package desafio.banco_digital.interfaces;

public interface IConta {
  public void sacar(double valor);
  public void depositar(double valor);
  public void transferir(double valor, IConta contaDestino);
  public void imprimirExtrato();
}
