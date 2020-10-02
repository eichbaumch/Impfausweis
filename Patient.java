import java.util.HashMap;
/**
 * In der Klasse Patient wird dessen Name, Geburtsdatum, Geschlecht, Adresse und Telefonnummer gepeichert. 
 * Es wird eine HashMap mit sechs Objekten der Klasse SdtImpfung angelegt. Dem Patient kann jede Standardimpfung 
 * extra geimpft werden. Er kann eine seinen Impfstatus für einzelne Impfungen, sowie die bei den StdImpfungen
 * hinterlegte Information abrufen.
 * 
 * @author (Konrad Sautter, Pascale Gülcher, Hannah Schweitz, Sophia Parpoulas, Lena Speiser, Christopher Eichbaum) 
 * @version (30.09.2020)
 */

public class Patient
{   
    private String Patientenname, Geburtsdatum, Geschlecht, Adresse, Telefonnummer;
    private HashMap <String, StdImpfung> HashImpfungen = new HashMap();

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
        HashImpfungen.put("Roeteln", new StdImpfung("Roeteln"));
        HashImpfungen.put("Masern", new StdImpfung("Masern"));
        HashImpfungen.put("Tetanus", new StdImpfung("Tetanus"));

    }

    public Patient()
    {
        Patientenname = "Max Mustermann";
        Geburtsdatum = "01.02.2020";
        Geschlecht = "w/m/d";
        Adresse = "Seestraße 1, 12345 Musterstadt";
        Telefonnummer = "+491234567890";

        HashImpfungen.put("HepatitisA", new StdImpfung("HepatitisA"));
        HashImpfungen.put("HepatitisB", new StdImpfung("HepatitisB"));
        HashImpfungen.put("Mumps", new StdImpfung("Mumps"));
        HashImpfungen.put("Roeteln", new StdImpfung("Roeteln"));
        HashImpfungen.put("Masern", new StdImpfung("Masern"));
        HashImpfungen.put("Tetanus", new StdImpfung("Tetanus"));

    }

    public String HepatitisAImpfen()
    {
       StdImpfung A1= HashImpfungen.get("HepatitisA");
        if( A1.getImpfstatus() <3)
        {
            A1.StatusAendern();
            String C= A1.setNaechsteImpfung();
            return C;
        }
        else
            return "Keine weitere Impfung notwendig";
    }

    public String HepatitisBImpfen()
    {
         StdImpfung A2= HashImpfungen.get("HepatitisB");
        if( A2.getImpfstatus() <3)
        {
            A2.StatusAendern();
            String C= A2.setNaechsteImpfung();
            return C;
        }
        else
            return "Keine weitere Impfung notwendig";
    }

    public String MasernImpfen()
    {
        StdImpfung A3= HashImpfungen.get("Masern");
        if( A3.getImpfstatus() <3)
        {
            A3.StatusAendern();
            String C= A3.setNaechsteImpfung();
            return C;
        }
        else
            return "Keine weitere Impfung notwendig";
    }

    public String MumpsImpfen()
    {
        StdImpfung A4= HashImpfungen.get("Mumps");
        if( A4.getImpfstatus() <3)
        {
            A4.StatusAendern();
            String C= A4.setNaechsteImpfung();
            return C;
        }
        else
            return "Keine weitere Impfung notwendig";
    }

    public String RoetelnImpfen()
    {
        StdImpfung A5= HashImpfungen.get("Roeteln");
        if( A5.getImpfstatus() <3)
        {
            A5.StatusAendern();
            String C= A5.setNaechsteImpfung();
            return C;
        }
        else
            return "Keine weitere Impfung notwendig";
    }

    public String TetanusImpfen()
    {
        StdImpfung A6= HashImpfungen.get("Tetanus");
        if( A6.getImpfstatus() <3)
        {
            A6.StatusAendern();
            String C= A6.setNaechsteImpfung();
            return C;
        }
        else
            return "Keine weitere Impfung notwendig";
    }

    /**
     * Gibt aktuellen Status der eingegebenen Impfung zurück
     *
     * @param Impfname
     * @return ImpfStatus
     */
    public String Impfuebersicht(String Impfname)
    {
        StdImpfung A7= HashImpfungen.get(Impfname);
        int ImpfStatus = A7.getImpfstatus();
        String Ausgabe = Impfname + ": " + ImpfStatus;
        return Ausgabe;
    }

    /**
     * Gibt Informationen über einzelne Impfungen zurück
     * 
     * @param Impfname
     * @return Info
     */
    public String Informationsuebersicht(String Impfname)
    {
        StdImpfung A8 = HashImpfungen.get(Impfname);
        String Info = A8.getInformation();
        String Ausgabe = Impfname + ": " + Info;
        return Ausgabe;
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
