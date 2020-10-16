
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse PatientTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PatientTest
{
    /**
     * Konstruktor fuer die Test-Klasse PatientTest
     */
    public PatientTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    //@TEST

    public void HepatitisAImpfen()
    {
        Patient patient1 = new Patient("Max", "Mustermann", "Weiblich", "Seestraße 1", "123456789");
        //assertEquals(, patient1.HepatitisAImpfen());
    }   

    //@TEST

    public void HepatitisBImpfen()
    {
        Patient patient1 = new Patient("Max", "Mustermann", "Weiblich", "Seestraße 1", "123456789");
        //assertEquals(, patient1.HepatitisBImpfen());       
    }

    //@TEST

    public void MasernImpfen()
    {
        Patient patient1 = new Patient("Max", "Mustermann", "Weiblich", "Seestraße 1", "123456789");
        //assertEquals(, patient1.MasernImpfen());  

    }

    //@TEST

    public void MumpsImpfen()
    {
        Patient patient1 = new Patient("Max", "Mustermann", "Weiblich", "Seestraße 1", "123456789");
        //assertEquals(, patient1.MumpsImpfen());        
    }

    //@TEST

    public void RoetelnImpfen()
    {
        Patient patient1 = new Patient("Max", "Mustermann", "Weiblich", "Seestraße 1", "123456789");
        //assertEquals(, patient1.RoetelnImpfen());
    }

    //@TEST

    public void TetanusImpfen()
    {
        Patient patient1 = new Patient("Max", "Mustermann", "Weiblich", "Seestraße 1", "123456789");
        //assertEquals(, patient1.TetanusImpfen());
        //assertEquals(, patient1.TetanusImpfen());
    }

    //@TEST

    public void Informationsübersicht ()
    {
        Patient patient1 = new Patient();
        //assertEquals(, patient1.Informationsuebersicht("HepatitisA"));
        //assertEquals(, patient1.Informationsuebersicht("HepatitisB"));
        //assertEquals(, patient1.Informationsuebersicht("Masern"));
        //assertEquals(, patient1.Informationsuebersicht("Mumps"));
        //assertEquals(, patient1.Informationsuebersicht("Roeteln"));
        //assertEquals(, patient1.Informationsuebersicht("Tetanus"));
    }

    //@TEST

    public void Impfuebersicht()
    {

        Patient patient2 = new Patient("Max Mustermann", "01.01.2000", "Männlich", "Seestraße 1", "123456789");
        //assertEquals(, patient2.Impfuebersicht("HepatitisA"));
        //assertEquals(, patient2.Impfuebersicht("HepatitisB"));
        //assertEquals(, patient2.Impfuebersicht("Masern"));
        //assertEquals(, patient2.Impfuebersicht("Mumps"));
        //assertEquals(, patient2.Impfuebersicht("Roeteln"));
        //assertEquals(, patient2.Impfuebersicht("Tetanus"));
    }
    //@TEST

    public void GesamteImpfuebersicht()

    {
        Patient patient3 = new Patient("Lea", "Los", "weiblich", "Seestraße 5", "987654321");
        //assertEquals(, patient3.GesamteImpfuebersicht());

    }  



}


