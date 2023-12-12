/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 31.10.2023
 * @author 
 */

public class Mensch {
  
  // Anfang Attribute
  public String vorname;
  public String name;
  public double geburtsjahr;
  // Ende Attribute
  
  public Mensch(String vornameA, String nameA, int geburtsjahrA){
    this.vorname = vornameA;
    this.name = nameA;
    this.geburtsjahr = geburtsjahrA;  
    }
  
  // Anfang Methoden

  public void sprechen() {
    System.out.println(name);
  }

  // Ende Methoden
} // end of Mensch
