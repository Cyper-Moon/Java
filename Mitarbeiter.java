/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 24.10.2023
 * @author 
 */

public class Mitarbeiter {
  
  // Anfang Attribute
  public int MitarbeiterNr;
  public String Name;
  public String Vorname;
  public String Beruf;
  public double Gehalt;
  // Ende Attribute
  
  public void GibAlleDaten(){
    System.out.println(this.MitarbeiterNr);
    System.out.println(this.Beruf);
    }
  
  // Anfang Methoden
  public int getMitarbeiterNr() {
    return MitarbeiterNr;
  }

  public void setMitarbeiterNr(int MitarbeiterNrNeu) {
    MitarbeiterNr = MitarbeiterNrNeu;
  }

  public String getName() {
    return Name;
  }

  public void setName(String NameNeu) {
    Name = NameNeu;
  }

  public String getVorname() {
    return Vorname;
  }

  public void setVorname(String VornameNeu) {
    Vorname = VornameNeu;
  }

  public String getBeruf() {
    return Beruf;
  }

  public void setBeruf(String BerufNeu) {
    Beruf = BerufNeu;
  }

  public double getGehalt() {
    return Gehalt;
  }

  public void setGehalt(double GehaltNeu) {
    Gehalt = GehaltNeu;
  }

  // Ende Methoden
} // end of Mitarbeiter
