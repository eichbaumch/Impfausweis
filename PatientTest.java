

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

    @Test
    public void Gesamtübersicht()
    {
        Patient patient3 = new Patient("Lea", "Los", "weiblich", "Seestraße 5", "987654321");
        assertEquals(, patient3.GesamteImpfuebersicht());
    }
}

