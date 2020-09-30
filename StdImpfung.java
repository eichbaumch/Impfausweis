
/**
 * Beschreiben Sie hier die Klasse StdImpfung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StdImpfung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    protected String Impfname;
    protected String Information;
    public int Abstand;
    public int letzteImpfung;
    public int Impfstatus;

    
    public StdImpfung()
    {
       this.Impfname=Impfname;
        this.Information= Information;
        this.Abstand= Abstand;
        this.Impfstatus=Impfstatus;
    }
    
    public String getInformation()
    {
       HepatitisA Infos = new HepatitisA();
        
        String a=Infos.getInfo();
        return a;
    }
   
    
    
    
    
    
    
    
    
    
    
}
