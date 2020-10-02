
/**
 * Beschreiben Sie hier die Klasse StdImpfung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StdImpfung
{

    private String Impfname;
    private String Information;
    private int Abstand;
    private String naechsteImpfung;
    private int Impfstatus;
    private int maxAnzahl;

    public StdImpfung(String Impfname)
    {
        switch(Impfname)
        {
            case "HepatitisA": Information="bei Häufigem Reisen oder Kontakt zu Kranken, Abstand zwischen der ersten und zweiten Impfung 6 Monate";
            Abstand=6;
            naechsteImpfung="0";
            Impfstatus=0;
            maxAnzahl=2;

            break;
            case "HepatitisB": Information="Bei häufigem Reisen, geschwächter Immunabwehr und Kontakt zu Kranken, Impfung bei 2, 4 und 6 Monaten";
            Abstand=2;
            naechsteImpfung="0";
            Impfstatus=0;
            maxAnzahl=3;
            break;
            case "Mumps": Information="Viruserkrankung über Tröpfcheninfektion, erste Impfung bei 11 Monaten und zweite bei 15 Monaten ";
            Abstand=4;
            naechsteImpfung="0";
            Impfstatus=0;
            maxAnzahl=2;
            break;

            case "Roeteln": Information="Erwachsene Frauen und Personal, welches Kontakt zu Schwangeren und Kleinkindern hat, erste Impfung nach 11 Monaten und die zweite nach 15";
            Abstand=4;
            naechsteImpfung="0";
            Impfstatus=0;
            maxAnzahl=2;
            break;

            case "Masern": Information="Besonders gefährdet sind ungeimpfte Kleinkinder und Jugendliche, erste Impfung nach 13 Monaten und die zweite nach 17 Monaten  ";
            Abstand=4;   
            naechsteImpfung="0";
            Impfstatus=0;
            maxAnzahl=2;
            break;
            case "Tetanus": Information="Soll Wundstarrkrampf durch Krankheitserreger verhindern, erste Impfung nach 2 Monaten, die zweite nach 4 Monaten und die letzte nach 10 Monaten, soll alle 10 Jahre wiederholt werden";
            Abstand=2;
            naechsteImpfung="0";
            Impfstatus=0;
            maxAnzahl=3;
            break;
        }

    }

    public String getInformation()
    {
        return Information;
    }

    //public int getAbstand()
    //{
    //return Abstand;
    //}

    public String setNaechsteImpfung()
    {
        naechsteImpfung=Datum();
        return naechsteImpfung;
    }

    public int getImpfstatus()
    {
        return StatusAendern();
    }

    public void setImpfstatus(int neuerStatus)
    {
        Impfstatus=neuerStatus;  
    }

    public  String Datum ()
    {
        if (Abstand==2)
        {

            Date now= new Date();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(now);

            calendar.add(Calendar.DAY_OF_MONTH, 61);
            Date future = calendar.getTime();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println ("Now:     "+ dateFormat.format(now));
            System.out.println("Future:  " + dateFormat.format(future));
            return dateFormat.format(future);

        }
        else if(Abstand==4)
        {
            Date now= new Date();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(now);

            calendar.add(Calendar.DAY_OF_MONTH, 122);
            Date future = calendar.getTime();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println ("Now:     "+ dateFormat.format(now));
            System.out.println("Future:  " + dateFormat.format(future));
            return dateFormat.format(future);

        }
        else
        if(Abstand==6)
        {
            Date now= new Date();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(now);

            calendar.add(Calendar.DAY_OF_MONTH, 180);
            Date future = calendar.getTime();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println ("Now:     "+ dateFormat.format(now));
            System.out.println("Future:  " + dateFormat.format(future));
            return dateFormat.format(future);
        }
        else
            System.out.println("Abstand nicht verfügbar");
        return null;

    }

    public int StatusAendern()
    {
        if (Impfstatus<2)
        {
            Impfstatus=Impfstatus+1;
        }
        else if (maxAnzahl==3 && Impfstatus==2)
        {
            Impfstatus=Impfstatus+1;
        }
        
        else System.out.println("Keine weitere Impfung notwendig");
        return Impfstatus;
    }
}

