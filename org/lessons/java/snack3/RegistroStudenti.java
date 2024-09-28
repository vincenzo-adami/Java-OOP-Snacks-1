// Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare oggetti Studente. Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. Aggiungi un metodo che stampi la lista degli studenti.

public class RegistroStudenti {

  private Studente[] elencoStudenti;

  RegistroStudenti(int grandezzaRegistro) {
    this.elencoStudenti = new Studente[grandezzaRegistro];
  }

  public void addStudenti(Studente studente) {
    boolean inserito = false;
    for (int i = 0; i < elencoStudenti.length; i++) {
      if (elencoStudenti[i] == null) {
        inserito = true;
        elencoStudenti[i] = studente;
        break;
      }
    }
    if (!inserito) {
      System.out.println("il registro è completo");
    }
  }

  public void getElencoStudenti() {
    System.out.println("Il registro è composta da: ");
    for (int i = 0; i < elencoStudenti.length; i++) {
      System.out.println(this.elencoStudenti[i].getStudenteCompleto());
    }
  }

  public void aggiungiSpazioRegistro(int grandezza) {
    if (this.elencoStudenti.length > grandezza) {
      System.out.println("Valore inserito non valido");
    }
    Studente[] appoggio = new Studente[this.elencoStudenti.length];
    for (int i = 0; i < appoggio.length; i++) {
      appoggio[i] = this.elencoStudenti[i];
    }
    Studente[] elencoStudentiNew = new Studente[grandezza];
    for (int i = 0; i < appoggio.length; i++) {
      elencoStudentiNew[i] = appoggio[i];
    }
    this.elencoStudenti = elencoStudentiNew;
  }
}
