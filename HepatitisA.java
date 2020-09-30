
/**
 * Beschreiben Sie hier die Klasse HepatitiA.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HepatitisA extends StdImpfung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //protected String Impfname;
    //protected String Information;
    //public int Abstand;
    //public int letzteImpfung;
    //public int Impfstatus;

    /**
     * Konstruktor für Objekte der Klasse HepatitiA
     */
    public HepatitisA()
    {
        // Instanzvariable initialisieren
        Impfname="HepatitisA";
        Information="Test";
        Abstand=11;
        letzteImpfung=12;
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
