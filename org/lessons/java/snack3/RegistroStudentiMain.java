public class RegistroStudentiMain {
  public static void main(String[] args) {
    RegistroStudenti registroPiccolo = new RegistroStudenti(3);

    Studente stu1 = new Studente("Vincenzo", "Adami", 32);
    Studente stu2 = new Studente("Mario", "Rossi", 27);
    Studente stu3 = new Studente("Giudeppe", "Verdi", 29);

    registroPiccolo.addStudenti(stu1);
    registroPiccolo.addStudenti(stu2);
    registroPiccolo.addStudenti(stu3);

    System.out.println("Registro grande 3");
    registroPiccolo.getElencoStudenti();

    registroPiccolo.aggiungiSpazioRegistro(5);
    Studente stu4 = new Studente("Anna", "Giallo", 25);
    Studente stu5 = new Studente("Maria", "Bianchi", 30);

    registroPiccolo.addStudenti(stu4);
    registroPiccolo.addStudenti(stu5);

    System.out.println("Registro grande 5");
    registroPiccolo.getElencoStudenti();
  }
}
