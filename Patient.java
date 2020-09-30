/**
 * Beschreiben Sie hier die Klasse Patient.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Patient
{
    private String Patientenname, Geburtsdatum, Geschlecht, Adresse, Telefonnummer;

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
    }

    public void HepatitisAImpfen()
    {

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
    public void Impfuebersicht()
    {

    }

    /**
     * Gibt Informationen über einzelne Impfungen auf dem Bildschirm aus
     * 
     * @param Objekt aus StdImpfung (impfname)
     * @return keine
     */
    public void InformationenAbfragen(StdImpfung Impfung)
    {
        System.out.println(Impfung.getInformation());
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
