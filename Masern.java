
/**
 * Beschreiben Sie hier die Klasse Masern.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Masern extends StdImpfung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    

    /**
     * Konstruktor für Objekte der Klasse HepatitisB
     */
    public Masern()
    {
        // Instanzvariable initialisieren
        Impfname="Masern";
        Information="ungeimpfte Kleinkinder besonders gefährdet";
        Abstand=4; //11-14 und 15-23 Monat
        letzteImpfung=15;
        Impfstatus=0;
    }

    public String getName ()
    {
        return Impfname;
    }
    
    public String getInfo()
    {
        return Information;
    }
    
    public int getStatus()
    {
        return Impfstatus;
    }
}
