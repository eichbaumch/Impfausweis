

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
    public void NaechsteImpfung()
    {
        StdImpfung stdImpfu1 = new StdImpfung("HepatitisA");
    }

    @Test
    public void StatusAendern()
    {
        StdImpfung stdImpfu1 = new StdImpfung("HepatitisA");
        // assertEquals(1, stdImpfu1.StatusAendern());
        // assertEquals(2, stdImpfu1.StatusAendern());
        StdImpfung stdImpfu2 = new StdImpfung("HepatitisB");
        // assertEquals(1, stdImpfu2.StatusAendern());
        // assertEquals(2, stdImpfu2.StatusAendern());
        // assertEquals(3, stdImpfu2.StatusAendern());
        StdImpfung stdImpfu3 = new StdImpfung("Masern");
        // assertEquals(1, stdImpfu3.StatusAendern());
        // assertEquals(2, stdImpfu3.StatusAendern());
        StdImpfung stdImpfu4 = new StdImpfung("Mumps");
        // assertEquals(1, stdImpfu4.StatusAendern());
        // assertEquals(2, stdImpfu4.StatusAendern());
        StdImpfung stdImpfu5 = new StdImpfung("Roeteln");
        // assertEquals(1, stdImpfu5.StatusAendern());
        // assertEquals(2, stdImpfu5.StatusAendern());
        StdImpfung stdImpfu6 = new StdImpfung("Tetanus");
        // assertEquals(1, stdImpfu6.StatusAendern());
        // assertEquals(2, stdImpfu6.StatusAendern());
        // assertEquals(3, stdImpfu6.StatusAendern());
    }
}


