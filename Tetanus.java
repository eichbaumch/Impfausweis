
/**
 * Beschreiben Sie hier die Klasse Tetanus.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tetanus extends StdImpfung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    

    /**
     * Konstruktor für Objekte der Klasse HepatitisB
     */
    public Tetanus()
    {
        // Instanzvariable initialisieren
        Impfname="Tetanus";
        Information="verhindert Wundstarrkrampf durch Erreger";
        Abstand=2; // ??
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