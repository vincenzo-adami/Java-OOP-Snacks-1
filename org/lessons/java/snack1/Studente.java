// Scrivi una classe Studente con i seguenti attributi:nome,cognome,età.Implementa un costruttore che accetta tre parametri per inizializzare questi attributi.Aggiungi un metodo che restituisca una stringa concatenata dei valori(es.Anselmo Bitta,24 anni).

public class Studente {

  private String nome;
  private String cognome;
  private int eta;

  Studente(String nome, String cognome, int eta) {
    this.nome = nome;
    this.cognome = cognome;
    this.eta = eta;
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return nome;
  }

  void setCognome(String cognome) {
    this.cognome = cognome;
  }

  String getCognome() {
    return cognome;
  }

  void setEta(int eta) {
    this.eta = eta;
  }

  int getEta() {
    return eta;
  }

  String getStudenteCompleto() {
    return nome + " " + cognome + ", " + eta + " anni";
  }

}
