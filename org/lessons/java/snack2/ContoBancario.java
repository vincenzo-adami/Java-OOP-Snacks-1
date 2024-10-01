// Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.

public class ContoBancario {

  private String numConto;
  private double saldo;

  ContoBancario(String numConto) {
    this.numConto = numConto;
    this.saldo = 0;
  }

  String getNumConto() {
    return numConto;
  }

  double getSaldo() {
    return saldo;
  }

  void depositare(double valore) {
    if (valore > 0) {
      this.saldo += valore;
    } else {
      System.out.println("Il valore inserito è 0 o un numero non ammisibile. Ritenta.");
    }
  }

  void prelevare(double valore) {
    if (this.saldo >= valore) {
      this.saldo -= valore;
    } else {
      System.out.println("Il saldo non è sufficente a coprire questa operazione");
    }
  }

}
