
/**
 * Beschreiben Sie hier die Klasse HepatitisB.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.text.DateFormat;
    import java.text.SimpleDateFormat;
    import java.util.Calendar;
    import java.util.date;
    import java.util.GregorianCalendar;
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
    
    public int getStatus()
    {
        return Impfstatus;
    }
    
    public static void main (String[]args)
    {
        
    }
}
