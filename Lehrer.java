/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 31.10.2023
 * @author 
 */

public class Lehrer extends Mensch {
  
  // Anfang Attribute
  public int personalnummer;
  // Ende Attribute
  
  public Lehrer(String vornameA,String nameA ,int geburtsjahrA,int personalnummerA){
     super(vornameA, nameA, geburtsjahrA);
     this.personalnummer = personalnummerA;
    
    
    }
  // Anfang Methoden

  public void KlausurKorrigieren() {
    // TODO hier Quelltext einfügen
    
  }

  // Ende Methoden
} // end of Lehrer
