
/**
 * Beschreiben Sie hier die Klasse Patient.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Patient
{

    public Patient(String Patientenname, String Geburtsdatum, String Geschlecht, String Adresse, int Telefonnummer)
    {
        this.Patientenname = Patientenname;
        this.Geburtsdatum = Geburtsdatum;
        this.Geschlecht = Geschlecht;
        this.Adresse = Adresse;
        this.Telefonnummer = Telefonnummer;
    }
      
    public void Impfuebersicht()
    {
        
    }
    
    public void InformationenAbfragen()
    {
        
    }
    
    public void setPatientenname(String neuerName)
    {
        Patientenname = neuerName;
    }
    
    public void setGeburtsdatum(String neuesGeburtsdatum)
    {
        Geburtsdatum = neuesGeburtsdatum;
    }
    
    public void setGeschlecht(String neuesGeschlecht)
    {
        Geschlecht = neuesGeschlecht;
    }
    
    public void setAdresse(String neueAdresse)
    {
        Adresse = neueAdresse;
    }
    
    public void setTelefonnummer(int neueTelefonnummer)
    {
        Telefonnummer = neueTelefonnummer;
    }
    
    public String getPatientenname()
    {
        return Patientenname;
    }
    
    public String getGeburtsdatum()
    {
        return Geburtsdatum;
    }
    
    public String getGeschlecht()
    {
        return Geschlecht;
    }
    
    public String getAdresse()
    {
        return Adresse;
    }
    
    public int getTelefonnummer()
    {
        return Telefonnummer;
    }
}

