
/**
 * Beschreiben Sie hier die Klasse Anwendung.
 * 
 * @author Konrad Sautter, Sophia Parpoulas 
 * @version 02.10.2020
 */
import java.util.ArrayList;
import java.util.Date;
public class Anwendung

{

   
    private ArrayList<Patient>Liste;

    /**
     * Standard Konstruktor, der durch erzeugen einer ArrayList eine Liste aller Patienten anlegt.
     * @param: Keine
     * @Return: Keine
     */
    public Anwendung()
    {
        Liste=new ArrayList<Patient>();

    }

    /**
     * Methode zum anlegen eines neuen Patienten, durch erzeugen eines neuen Objekts der Klasse Patient. Anschließendes Speichern in der ArrayList.
     * @param: String: Name, Geburtstag, Geschlecht, Adresse, Telefonnummer -> Attribute des Objekts Patient
     * @return: Keine
     */
    public void PatientHinzufuegen(String Name, String Geburtstag, String Geschlecht, String Adresse, String Telefonnummer)
    {
        Patient A= new Patient(Name,Geburtstag,Geschlecht,Adresse,Telefonnummer);
        Liste.add(A);
   }

   /**
    * Methode zum Suchen eines Patienten in der ArrayList durch Eingabe des Namens. Name wird verwendet um mit einer foreach Schleife jedes 
    * Element der Liste zu durchsuchen. Falls der Name mit einem Namen auf der Liste übereinstimmt, wird der Patient zurück gegeben. Ansonsten 
    * wird eine Fehlermeldung ausgegeben.
    * @Param: String Name 
    * @Return: Objekt Patient
    */ 
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

    
    /**
     * Methode zum löschen eines Patienten durch Eingabe des Namens. Die Methode ruft durch einen internen Methodenaufruf die Methode PatientSuchen()
     * auf. Falls der Patient gefunden wird, wird dieser entfernt.
     * @param: String Name
     * @return: Keine
     */
    public void PatientLoeschen(String Name)
    {
        Patient H = PatientSuchen(Name);
        Liste.remove(H);
        System.out.println("Der Patient wurde erfolgreich gelöscht.");
    }

    /**
     * Mehtode zum Impfen eines Patienten durch eingabe seines Namens und des Namens der Impfung, die durchgeführt werden soll.
     * Der Patient wird durch einen internen Methodenaufruf der Methode PatientSuchen() aufgerufen.
     * Anschließend wird durch eine switch-Anweisung die durchzuführende Impfung herausgesucht und durch einen externen Methodenaufruf
     * der jeweiligen Impfmethode in der Klasse Patient durchgeführt.
     * @ param: String: Patientenname, Impfname
     * @return: String:"Impfung erfolgreich durchgeführt"
     */
    public String Impfen(String Patientenname, String Impfname)
    {
        Patient B= PatientSuchen(Patientenname);
        switch(Impfname)
        {
            case "HepatitisA": B.HepatitisAImpfen();
            break;
            case "HepatitisB": B.HepatitisBImpfen();
            break;
            case "Masern": B.MasernImpfen();
            break;
            case "Mumps": B.MumpsImpfen();
            break;
            case"Roeteln":B.RoetelnImpfen();
            break;
            case "Tetanus": B.TetanusImpfen();
            break;
            default: System.out.println("Impfung nicht vorhanden");
            break;
            
            
        }
        return "Impfung erfolgreich durchgeführt.";
    }
    
    /**
     * Methode um den aktuellen Impfstatus eines Patinten abzufragen.
     * Es wird durch einen internen Methodenaufruf der Methode PatientSuchen() auf den Patient zugegriffen. Der Impfstatus wird 
     * durch einen externen Methodenaufruf der Methode Impfuebersicht() aus der Klasse Patient aufgerufen und in einer Variablen "Status" 
     * vom Datentyp int gespeichert.
     * @param: String: Name, Impfname
     * @return: int Status
     */
    public int StatusAbfragen(String Name, String Impfname)
    {
        Patient D= PatientSuchen(Name);
        int Status= D.Impfuebersicht(Impfname);
        return Status;
    }
    
    /**
     * Methode um die Informationen einer Impfung abzurufen.
     * Es wird durch einen internen Methodenaufruf der Methode PatientSuchen() auf den Patient zugegriffen.
     * Der Impfstatus wird durch einen externen Methodenaufruf der Methode Informationsuebersicht() aus der Klasse Patient aufgerufen 
     * und in einer variablen "Info" vom Datentyp String gespeichert.
     * @param: String: Name, Impfname
     * @return: String Info
     */
    public String InformationenAbfragen(String Name, String Impfname)
    {
        Patient E = PatientSuchen(Name);
        String Info= E.Informationsuebersicht(Impfname);
        return Info;
    }

}
