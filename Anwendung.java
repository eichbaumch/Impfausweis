
/**
 * Beschreiben Sie hier die Klasse Anwendung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.ArrayList;
import java.util.Date;
public class Anwendung

{

    private Patient A;
    private ArrayList<Patient>Liste;

    public Anwendung()
    {
        Liste=new ArrayList<Patient>();

    }

    public void PatientHinzufuegen(String Name, String Geburtstag, String Geschlecht, String Adresse, String Telefonnummer)
    {
        A= new Patient(Name,Geburtstag,Geschlecht,Adresse,Telefonnummer);
        Liste.add(A);
   }

    public Patient PatientSuchen(String Name)
   {
       
       for (Patient e: Liste)
       {
           if (e.getPatientenname().equals(Name))
            {
                return e;
            }
        }
        System.out.println("Der Patient ist nicht verfügbar");
        return null;
    }

    public void PatientLoeschen(String Name)
    {
        Patient H = PatientSuchen(Name);
        Liste.remove(H);
        System.out.println("Der Patient wurde erfolgreich gelöscht.");
    }

    public String Impfen(String Patientenname, String Impfname)
    {
        Patient B= PatientSuchen(Patientenname);
        switch(Impfname)
        {
            case "HepatitisA": B.HepatitisAImpfen(Impfname);
            break;
            case "HepatitisB": B.HepatitisBImpfen(Impfname);
            break;
            case "Masern": B.MasernImpfen(Impfname);
            break;
            case "Mumps": B.MumpsImpfen(Impfname);
            break;
            case"Roeteln":B.RoetelnImpfen(Impfname);
            break;
            case "Tetanus": B.TetanusImpfen(Impfname);
            break;
            
            
            
        }
        return "Impfung erfolgreich durchgeführt.";
    }

    public int StatusAbfragen(String Name, String Impfname)
    {
        Patient D= PatientSuchen(Name);
        int Status= D.Impfuebersicht(Impfname);
        return Status;
    }
    
    public String InformationenAbfragen(String Name, String Impfname)
    {
        Patient E = PatientSuchen(Name);
        String Info= E.Informationsuebersicht(Impfname);
        return Info;
    }
}
