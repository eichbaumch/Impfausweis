
/**
 * Beschreiben Sie hier die Klasse StdImpfung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.HashMap;

public class StdImpfung
{
    

    private String Impfname;
    private String Information;
    private int Abstand;
    private int letzteImpfung;
    private int Impfstatus;
    
    public StdImpfung(String Impfname)
    {
        switch(Impfname)
        {
            case "HepatitisA": Information="bei";
                               Abstand=2;
                               letzteImpfung=29;
                               Impfstatus=0;
                               break;
            case "HepatitisB": Information="Test2";
                                Abstand=4;
                                letzteImpfung=31;
                                Impfstatus=0;
                                break;
            case "Mumps": Information=" ";
                            break;
            
        }
        
    }
    
    public String getInformation()
    {
        return Information;
    }

    public int getAbstand()
    {
        return Abstand;
    }

    public int getLetzteImpfung()
    {
        return letzteImpfung;
    }
    
    public int getImpfstatus()
    {
        return Impfstatus;
    }
    
    
    
    
    
}
