/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 31.10.2023
 * @author 
 */

public class Schueler extends Mensch {
  
  // Anfang Attribute
  public int jahrgang;
  // Ende Attribute
  
  public Schueler(String vornameA, String nachnameA,int geburtsjahrA ,int jahrgangA){
    super(vornameA, nachnameA, geburtsjahrA);
    this.jahrgang = jahrgangA;
    }
  // Anfang Methoden

  public void KlausurSchreiben() {
    // TODO hier Quelltext einfügen
  }

  // Ende Methoden
} // end of Schueler
