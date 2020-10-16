

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse AnwendungTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AnwendungTest
{
    /**
     * Konstruktor fuer die Test-Klasse AnwendungTest
     */
    public AnwendungTest()
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
    public void PatientenVerwaltung()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Max Mustermann", "01.01.2000", "männlich", "Mustertsraße1", "1234567890");
        assertEquals("Patientenname erfolgreich geändert", anwendun1.PatientendatenAendern("Patientenname", "Max Mustermann", "Moritz Mustermann"));
        assertEquals("Geburtsdatum erfolgreich geändert", anwendun1.PatientendatenAendern("Geburtsdatum", "Moritz Mustermann", "02.02.2000"));
        assertEquals("Geschlecht erfolgreich geändert", anwendun1.PatientendatenAendern("Geschlecht", "Moritz Mustermann", "weiblich"));
        assertEquals("Adresse erfolgreich geändert", anwendun1.PatientendatenAendern("Adresse", "Moritz Mustermann", "Musterstraße 2"));
        assertEquals("Telefonnummer erfolgreich geändert", anwendun1.PatientendatenAendern("Telefonnummer", "Moritz Mustermann", "012345"));
        assertEquals("falsche Eingabe", anwendun1.PatientendatenAendern("Alter", "Moritz Mustermann", "12"));
        anwendun1.PatientLoeschen("Moritz Mustermann");
    }
}

