/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 24.10.2023
 * @author 
 */

public class Startklasse {
 public static void main(String args[]){
    Mitarbeiter mitarbeiter01;
    mitarbeiter01 = new Mitarbeiter();
    
    mitarbeiter01.MitarbeiterNr = 001;
    mitarbeiter01.Name = "Walser";
    mitarbeiter01.Vorname = "Frank";
    mitarbeiter01.Beruf = "Lagerist";
    mitarbeiter01.Gehalt = 1600;
    
    Mitarbeiter mitarbeiter02;
    mitarbeiter02 = new Mitarbeiter();
    
    mitarbeiter02.MitarbeiterNr = 002;
    mitarbeiter02.Name = "Flink";
    mitarbeiter02.Vorname = "Eva";
    mitarbeiter02.Beruf = "Sekretaerin";
    mitarbeiter02.Gehalt = 1650;
    
    Mitarbeiter mitarbeiter03;
    mitarbeiter03 = new Mitarbeiter();
    
    mitarbeiter03.MitarbeiterNr = 003;
    mitarbeiter03.Name = "Boss";
    mitarbeiter03.Vorname = "Hans";
    mitarbeiter03.Beruf = "Geschaeftsfuehrer";
    mitarbeiter03.Gehalt = 4000;
    
    mitarbeiter03.GibAlleDaten();
    
    
    
    
    
    
    
     }
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  // Ende Methoden
} // end of Startklasse
