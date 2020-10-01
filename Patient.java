/**
 * Beschreiben Sie hier die Klasse Patient.
 * 
 * @author (Konrad Sautter, Pascale Gülcher, Hannah Schweitz, Sophia Parpoulas, Lena Speiser, Christopher Eichbaum) 
 * @version (30.09.2020)
 */
import java.util.HashMap;

public class Patient
{
    private String Patientenname, Geburtsdatum, Geschlecht, Adresse, Telefonnummer;
    private HashMap<String, StdImpfung>HashImpfungen= new HashMap<String, StdImpfung>();

    /**
     * Konstruktor für Objekte der Klasse Patient
     */
    public Patient(String Patientenname, String Geburtsdatum, String Geschlecht, String Adresse, String Telefonnummer)
    {
        this.Patientenname = Patientenname;
        this.Geburtsdatum = Geburtsdatum;
        this.Geschlecht = Geschlecht;
        this.Adresse = Adresse;
        this.Telefonnummer = Telefonnummer;
        
        
        HashImpfungen.put("HepatitisA", new StdImpfung("HepatitisA"));
        HashImpfungen.put("HepatitisB", new StdImpfung("HepatitisB"));
        HashImpfungen.put("Mumps", new StdImpfung("Mumps"));
        HashImpfungen.put("Röteln", new StdImpfung("Röteln"));
        HashImpfungen.put("Masern", new StdImpfung("Masern"));
        HashImpfungen.put("Tetanus", new StdImpfung("Tetanus"));
        
    }

    public void HepatitisAImpfen(String Impfname)
    {
       HashImpfungen.get(Impfname);
      
        
    }

    public void HepatitisBImpfen()
    {

    }

    public void MasernImpfen()
    {

    }

    public void MumpsImpfen()
    {

    }

    public void RötelnImpfen()
    {

    }

    public void TetanusImpfen()
    {

    }

    /**
     * Gibt aktuellen Status aller Impfungen auf dem Bildschirm aus
     * @param keine
     * @return keine
     */
    public String Impfuebersicht()
    {
        return null;
    }

    /**
     * Gibt Informationen über einzelne Impfungen auf dem Bildschirm aus
     * 
     * @param Objekt aus StdImpfung (impfname)
     * @return keine
     */
    public String Informationsuebersicht()//StdImpfung Impfung
    {
        return null;
    }

    /**
     * Ändert den Patienenname
     * 
     * @param neuerName
     * @return keine
     * 
     */
    public void setPatientenname(String neuerName)
    {
        Patientenname = neuerName;
    }

    /**
     * Ändert das Geburtsdatum
     * 
     * @param neuesGeburtsdatum
     * @return keine
     * 
     */
    public void setGeburtsdatum(String neuesGeburtsdatum)
    {
        Geburtsdatum = neuesGeburtsdatum;
    }

    /**
     * Ändert das Geschlecht
     * 
     * @param neuesGeschlecht
     * @return keine
     * 
     */
    public void setGeschlecht(String neuesGeschlecht)
    {
        Geschlecht = neuesGeschlecht;
    }

    /**
     * Ändert die Adresse
     * 
     * @param neueAdresse
     * @return keine
     * 
     */
    public void setAdresse(String neueAdresse)
    {
        Adresse = neueAdresse;
    }

    /**
     * Ändert die Telefonnummer
     * 
     * @param neueTelefonnummer
     * @return keine
     * 
     */
    public void setTelefonnummer(String neueTelefonnummer)
    {
        Telefonnummer = neueTelefonnummer;
    }

    /**
     * Gibt den Patientennamen aus
     * 
     * @param keine
     * @return Patientenname
     * 
     */
    public String getPatientenname()
    {
        return Patientenname;
    }

    /**
     * Gibt das Geburtsdatum aus
     * 
     * @param keine
     * @return Geburtsdatum
     * 
     */
    public String getGeburtsdatum()
    {
        return Geburtsdatum;
    }

    /**
     * Gibt das Geschlecht aus
     * 
     * @param keine
     * @return Geschlecht
     * 
     */
    public String getGeschlecht()
    {
        return Geschlecht;
    }

    /**
     * Gibt die Adresse aus
     * 
     * @param keine
     * @return Adresse
     * 
     */
    public String getAdresse()
    {
        return Adresse;
    }

    /**
     * Gibt die Telefonnummer aus
     * 
     * @param keine
     * @return Telefonnummer
     * 
     */
    public String getTelefonnummer()
    {
        return Telefonnummer;
    }
}
