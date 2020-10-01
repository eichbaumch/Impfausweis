
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
            case "HepatitisA": Information="bei Häufigem Reisen oder Kontakt zu Kranken, Abstand zwischen der ersten und zweiten Impfung 6 Monate";
                               Abstand=6;
                               letzteImpfung=0;
                               Impfstatus=0;
                               break;
            case "HepatitisB": Information="Bei häufigem Reisen, geschwächter Immunabwehr und Kontakt zu Kranken, Impfung bei 2, 4 und 6 Monaten";
                                Abstand=2;
                                letzteImpfung=0;
                                Impfstatus=0;
                                break;
            case "Mumps": Information="Viruserkrankung über Tröpfcheninfektion, erste Impfung bei 11 Monaten und zweite bei 15 Monaten ";
                            Abstand=4;
                            letzteImpfung=0;
                            Impfstatus=0;
                            break;
                            
            case "Röteln": Information="Erwachsene Frauen und Personal, welches Kontakt zu Schwangeren und Kleinkindern hat, erste Impfung nach 11 Monaten und die zweite nach 15";
                            Abstand=4;
                            letzteImpfung=0;
                            Impfstatus=0;
                            break;
            case "Masern": Information="Besonders gefährdet sind ungeimpfte Kleinkinder und Jugendliche, erste Impfung nach 13 Monaten und die zweite nach 17 Monaten  ";
                            Abstand=4;   
                            letzteImpfung=0;
                            Impfstatus=0;
                            break;
          case "Tetanus": Information="Soll Wundstarrkrampf durch Krankheitserreger verhindern, erste Impfung nach 2 Monaten, die zweite nach 4 Monaten und die letzte nach 10 Monaten, soll alle 10 Jahre wiederholt werden";
                            Abstand=2;
                            letzteImpfung=0;
                            Impfstatus=0;
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
