
/**
 * Beschreiben Sie hier die Klasse Roeteln.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Roeteln extends StdImpfung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    

    /**
     * Konstruktor für Objekte der Klasse HepatitisB
     */
    public Roeteln()
    {
        // Instanzvariable initialisieren
        Impfname="Röteln";
        Information="erwachsene Frauen/Kontakt mit Kleinkindern&Schwangeren";
        Abstand=4; //11. und 15. Monat
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