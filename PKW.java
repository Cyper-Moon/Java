/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 21.11.2023
 * @author 
 */

public class PKW extends Auto {
  
  // Anfang Attribute
  private int autotuerAnzahl;
  private int mitfahrende;
  private int maxSitzplaetze;
  // Ende Attribute
  
  public PKW(String marke, int maxgeschwindigkeit, double tank, int kilometer, int autotuerAnzahl, int mitfahrende,int maxSitzplaetze){
    super(marke,maxgeschwindigkeit,tank,kilometer);
    this.autotuerAnzahl = autotuerAnzahl;
    this.mitfahrende = mitfahrende;
    this.maxSitzplaetze = maxSitzplaetze;
  }
  
  @Override
  public void fahren(int strecke) {
    if (this.tank != 0) {
      this.kilometer += strecke;
      this.tank--;
      System.out.println("Es werden " + strecke + " Kilometer gefahren.");
    } else
      System.out.println("Ihr Tank reicht nicht aus. Bitte tanken Sie!");
  } 
  @Override
  public void tanken(double liter) {
    this.tank += liter;
    System.out.println("Der neue Tankstand beträgt " + this.tank + " Liter.");
  }
  @Override
  public void anhalten(){
    System.out.println("Das Auto hat angehalten. Kilometerstand: " + this.kilometer + " Kilometer. Tankstand: "
    + this.tank + " Liter.");
  }

  public int getAutotuerAnzahl() {
    return autotuerAnzahl;
  }

  public void setAutotuerAnzahl(int autotuerAnzahlNeu) {
    autotuerAnzahl = autotuerAnzahlNeu;
  }

  public int getMitfahrende() {
    return mitfahrende;
  }

  public void setMitfahrende(int mitfahrendeNeu) {
    mitfahrende = mitfahrendeNeu;
  }

  public int getMaxSitzplaetze() {
    return maxSitzplaetze;
  }

  public void setMaxSitzplaetze(int maxSitzplaetzeNeu) {
    maxSitzplaetze = maxSitzplaetzeNeu;
  }

  public void mitnehmen(int zMit) {
    if (zMit + mitfahrende >= maxSitzplaetze) {
      System.out.println("Die maximale Anzahl der Sitzplaetze" + maxSitzplaetze + "ist erreicht");
    } else {
      System.out.println("Es passen noch " + (maxSitzplaetze - (zMit + mitfahrende))+ " Person in das Auto");
    } // end of if-else 
    
  }

  // Ende Methoden
} // end of PKW
