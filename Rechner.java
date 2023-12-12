/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 24.10.2023
 * @author 
 */

public class Rechner {
  
  // Anfang Attribute
  public String rechnername;
  public String benutzer;
  public String cpu;
  public int ram;
  public int harddisk;
  public int inv_nr;
  // Ende Attribute
  
  public Rechner(String rechnernamea, String benutzera, String cpua, int rama, int harddiska){
    this.rechnername = rechnernamea;
    this.benutzer = benutzera;
    this.cpu = cpua;
    this.ram = rama;
    this. harddisk = harddiska;
    this.inv_nr = 1000;
    incrementInvNr();
    }
  
  private void incrementInvNr() {
    this.inv_nr++;
}
 
  public void GibAlleDaten() {
    System.out.println(this.rechnername);
    }
  
  // Anfang Methoden

  public String getRechnername() {
    return rechnername;
  }

  public void setRechnername(String rechnernameNeu) {
    rechnername = rechnernameNeu;
  }

  public String getBenutzer() {
    return benutzer;
  }

  public void setBenutzer(String benutzerNeu) {
    benutzer = benutzerNeu;
  }

  public void setCpu(String cpuNeu) {
    cpu = cpuNeu;
  }

  public String getCpu() {
    return cpu;
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ramNeu) {
    ram = ramNeu;
  }

  public int getHarddisk() {
    return harddisk;
  }

  public void setHarddisk(int harddiskNeu) {
    harddisk = harddiskNeu;
  }

  public int getInv_nr() {
    return inv_nr;
  }

  public void setInv_nr(int inv_nrNeu) {
    inv_nr = inv_nrNeu;
  }

  // Ende Methoden
} // end of Rechner