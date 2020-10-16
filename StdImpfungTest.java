

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse StdImpfungTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StdImpfungTest
{
    /**
     * Konstruktor fuer die Test-Klasse StdImpfungTest
     */
    public StdImpfungTest()
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
    public void Impfstatus()
    {
        StdImpfung stdImpfu3 = new StdImpfung("HepatitisA");
        assertEquals(, stdImpfu3.getImpfstatus());
    }
    
    @TEST

    public void Informationen()
    {
        StdImpfung stdImpfu1 = new StdImpfung("HepatitisA");
        assertEquals(, stdImpfu1.getImpfstatus());
    }


}


