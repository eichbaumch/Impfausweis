
/**
 * Beschreiben Sie hier die Klasse Patient.
 * 
 * @author (Konrad Sautter, Pascale Gülcher, Hannah Schweitz, Sophia Parpoulas, Lena Speiser, Christopher Eichbaum) 
 * @version (30.09.2020)
 */
import java.util.HashMap;

public class Patient
{ private String Patientenname, Geburtsdatum, Geschlecht, Adresse, Telefonnummer;
    private HashMap<String, StdImpfung>HashImpfungen= new HashMap();

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

    public String HepatitisAImpfen(String Impfname)
    {
        StdImpfung A1= HashImpfungen.get(Impfname);
        A1.StatusAendern();
        String C= A1.setNaechsteImpfung();
        return C;
    }

    public String HepatitisBImpfen(String Impfname)
    {
        StdImpfung A2= HashImpfungen.get(Impfname);
        A2.StatusAendern();
        String C= A2.setNaechsteImpfung();
        return C;
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

    public String MumpsImpfen(String Impfname)
    {
        StdImpfung A4= HashImpfungen.get(Impfname);
        A4.StatusAendern();
        String C= A4.setNaechsteImpfung();
        return C;
    }

    public String RoetelnImpfen(String Impfname)
    {
        StdImpfung A5= HashImpfungen.get(Impfname);
        A5.StatusAendern();
        String C= A5.setNaechsteImpfung();
        return C;
    }

    public String TetanusImpfen(String Impfname)
    {
        StdImpfung A6= HashImpfungen.get(Impfname);
        A6.StatusAendern();
        String C=A6.setNaechsteImpfung();
        return  C;
    }

    /**
     * Gibt aktuellen Status der eingegebenen Impfung zurück
     *
     * @param Impfname
     * @return ImpfStatus
     */
    public int Impfuebersicht(String Impfname)
    {
        StdImpfung A7= HashImpfungen.get(Impfname);
        int ImpfStatus= A7.getImpfstatus();
        return ImpfStatus;
    }

    /**
     * Gibt Informationen über einzelne Impfungen zurück
     * 
     * @param Impfname
     * @return Info
     */
    public String Informationsuebersicht(String Impfname)
    {
        StdImpfung A8= HashImpfungen.get(Impfname);
        String Info= A8.getInformation();
        return Info;
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
