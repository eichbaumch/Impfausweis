
/**
 * Beschreiben Sie hier die Klasse Mumps.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mumps extends StdImpfung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    

    /**
     * Konstruktor für Objekte der Klasse HepatitisB
     */
    public Mumps()
    {
        // Instanzvariable initialisieren
        Impfname="Mumps";
        Information="Viruserkrankung; Tröpfcheninfektion";
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
    
    public int getStatus()
    {
        return Impfstatus;
    }
}