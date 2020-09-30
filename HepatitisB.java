
/**
 * Beschreiben Sie hier die Klasse HepatitisB.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HepatitisB extends StdImpfung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    

    /**
     * Konstruktor für Objekte der Klasse HepatitisB
     */
    public HepatitisB()
    {
        // Instanzvariable initialisieren
        Impfname="HepatitisB";
        Information="Test";
        Abstand=2;
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
    
    
}
