// Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.

public class ContoBancario {

  private String numConto;
  private double saldo;

  ContoBancario(String numConto) {
    setNumConto(numConto);
    this.saldo = 0;
  }

  private void setNumConto(String numConto) {
    this.numConto = numConto;
  }

  String getNumConto() {
    return numConto;
  }

  double getSaldo() {
    return saldo;
  }

  void depositare(double valore) {
    this.saldo += valore;
  }

  void prelevare(double valore) {
    if (this.saldo >= valore) {
      this.saldo -= valore;
    } else {
      System.out.println("Il saldo non è sufficente a coprire questa operazione");
    }
  }

}
