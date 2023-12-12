/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 31.10.2023
 * @author 
 */

public class Schule {
  
  public static void main(String[] args){
    Mensch Mensch1 = new Mensch("Hans", "Schmidt", 1999);
    Mensch1.sprechen();
    
    Mensch Mensch2 = new Mensch("Anna", "Gral", 2000);
    Mensch2.sprechen();
    
    Lehrer Lehrer1 = new Lehrer ("Konrad", "Funk", 1970, 1);
    Lehrer1.sprechen();
    
    Schueler Schueler1 = new Schueler ("Felix", "Funk", 2000, 12);
    Schueler1.sprechen();

    
    }

} // end of Schule
