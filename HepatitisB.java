
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
        Information="häufiges Reisen/Kontakt zu Kranken/geschwächte Immunabwehr";
        Abstand=2; //2. 4. 6. Monat
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
