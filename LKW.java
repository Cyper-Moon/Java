/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 21.11.2023
 * @author 
 */

public class LKW extends Auto {
  
  // Anfang Attribute
  private int maxLadegewicht;
  private int aktLadegewicht;
  // Ende Attribute
  
  public LKW(String marke, int maxgeschwindigkeit, double tank, int kilometer, int maxLadegewicht, int aktLadegewicht){
    super(marke,  maxgeschwindigkeit,  tank,  kilometer);
    this.maxLadegewicht = maxLadegewicht;
    this.aktLadegewicht = aktLadegewicht;
    // Anfang Methoden
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
  
  public int getMaxLadegewicht() {
    return maxLadegewicht;
  }

  public void setMaxLadegewicht(int maxLadegewichtNeu) {
    maxLadegewicht = maxLadegewichtNeu;
  }

  public int getAktLadegewicht() {
    return aktLadegewicht;
  }

  public void setAktLadegewicht(int aktLadegewichtNeu) {
    aktLadegewicht = aktLadegewichtNeu;
  }

  public void beladen(int zuladung) {
    if (maxLadegewicht >= zuladung + aktLadegewicht) {
      System.out.println("Es kann noch " + (maxLadegewicht - (zuladung + aktLadegewicht)) + " hinzugeladen werden");
    } else {
      System.out.println("Das maximale Ladegewicht von " + maxLadegewicht + " ist erreicht");
    } // end of if-else
  }

  // Ende Methoden
} // end of LKW
