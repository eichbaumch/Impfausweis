
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
    public void PatientHinzufügen()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Moritz Mustermann", "01.01.2000", "männlich", "Musterstraße 2", "012345");
        assertEquals(1, anwendun1.getLaenge());
    }

    @Test
    public void PatientenSuchen()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Moritz Mustermann", "01.01.2000", "männlich", "Musterstraße 2", "012345");
        assertEquals("Moritz Mustermann", anwendun1.PatientSuchen("Moritz Mustermann"));
    }


    @Test
    public void PatientSuchen2()
    {
        Anwendung anwendun1 = new Anwendung();
        assertEquals(null, anwendun1.PatientSuchen("Moritz Mustermann"));
    }

    @Test
    public void Impfungen()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Moritz Mustermann", "01.01.2000", "männlich", "Musterstraße 2", "012345");
        // assertEquals("Impfung durchgefuehrt. Naechste Impfung:   14.04.2021", anwendun1.Impfen("Moritz Mustermann", "HepatitisA"));
        // assertEquals("Impfung durchgefuehrt. Naechste Impfung:   16.12.2020", anwendun1.Impfen("Moritz Mustermann", "HepatitisB"));
        // assertEquals("Impfung durchgefuehrt. Naechste Impfung:  15.02.2021", anwendun1.Impfen("Moritz Mustermann", "Mumps"));
        // assertEquals("Impfung durchgefuehrt. Naechste Impfung:  15.02.2021", anwendun1.Impfen("Moritz Mustermann", "Roeteln"));
        // assertEquals("Impfung durchgefuehrt. Naechste Impfung:  15.02.2021", anwendun1.Impfen("Moritz Mustermann", "Masern"));
        // assertEquals("Impfung durchgefuehrt. Naechste Impfung:  16.12.2020", anwendun1.Impfen("Moritz Mustermann", "Tetanus"));
    }

    @Test
    public void Impfen2()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Moritz Mustermann", "01.01.2000", "männlich", "Musterstraße 1", "012345");
        //assertEquals("Impfung nicht vorhanden", anwendun1.Impfen("Moritz Mustermann", "Heuschnupfen"));
    }

    

    @Test
    public void PatientLoeschen()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Moritz Mustermann", "01.01.2000", "männlich", "Musterstraße 1", "012345");
        anwendun1.PatientLoeschen("Moritz Mustermann");
        assertEquals(null, anwendun1.PatientSuchen("Moritz Mustermann"));
    }

    @Test
    public void PatientLoeschen2()
    {
        Anwendung anwendun1 = new Anwendung();
    }

    @Test
    public void ImpfStatus()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Moritz Mustermann", "01.01.2000", "männlich", "Musterstraße 1", "012345");
        assertEquals("HepatitisA: 0", anwendun1.StatusAbfragen("Moritz Mustermann", "HepatitisA"));
        assertEquals("Hepatitis: 0", anwendun1.StatusAbfragen("Moritz Mustermann", "HepatitisB"));
        assertEquals("Masern: 0", anwendun1.StatusAbfragen("Moritz Mustermann", "Masern"));
        assertEquals("Mumps: 0", anwendun1.StatusAbfragen("Moritz Mustermann", "Mumps"));
        assertEquals("Roeteln: 0", anwendun1.StatusAbfragen("Moritz Mustermann", "Roeteln"));
        assertEquals("Tetanus: 0", anwendun1.StatusAbfragen("Moritz Mustermann", "Tetanus"));
    }

    @Test
    public void ImpfStatus2()
    {
        Anwendung anwendun1 = new Anwendung();
    }

    @Test
    public void AllgemeineImpfungen()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Moritz Mustermann", "01.01.2000", "männlich", "Musterstraße 2", "012345");
        assertEquals("HepatitisB: 0HepatitisA: 0Masern: 0Roeteln: 0Mumps: 0Tetanus: 0", anwendun1.AllgemeinerStatus("Moritz Mustermann"));
    }

    @Test
    public void AllgemeineImpfungen2()
    {
        Anwendung anwendun1 = new Anwendung();
    }

    @Test
    public void Informationen()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Moritz Mustermann", "01.01.2000", "männlich", "Musterstraße 2", "012345");
        assertEquals("HepatitisA:bei Häufigem Reisen oder Kontakt zu Kranken, Abstand zwischen der ersten und zweiten Impfung 6 Monate", anwendun1.InformationenAbfragen("Moritz Mustermann", "HepatitisA"));
        assertEquals("HepatitisB: Bei häufigem Reisen, geschwächter Immunabwehr und Kontakt zu Kranken, Impfung bei 2, 4 und 6 Monaten", anwendun1.InformationenAbfragen("Moritz Mustermann", "HepatitisB"));
        assertEquals("Masern: Besonders gefährdet sind ungeimpfte Kleinkinder und Jugendliche, erste Impfung nach 13 Monaten und die zweite nach 17 Monaten  ", anwendun1.InformationenAbfragen("Moritz Mustermann", "Masern"));
        assertEquals("Mumps: Viruserkrankung über Tröpfcheninfektion, erste Impfung bei 11 Monaten und zweite bei 15 Monaten ", anwendun1.InformationenAbfragen("Moritz Mustermann", "Mumps"));
        assertEquals("Roeteln: Erwachsene Frauen und Personal, welches Kontakt zu Schwangeren und Kleinkindern hat, erste Impfung nach 11 Monaten und die zweite nach 15", anwendun1.InformationenAbfragen("Moritz Mustermann", "Roeteln"));
        assertEquals("Tetanus: Soll Wundstarrkrampf durch Krankheitserreger verhindern, erste Impfung nach 2 Monaten, die zweite nach 4 Monaten und die letzte nach 10 Monaten, soll alle 10 Jahre wiederholt werden", anwendun1.InformationenAbfragen("Moritz Mustermann", "Tetanus"));
    }

    @Test
    public void Informationen2()
    {
        Anwendung anwendun1 = new Anwendung();
    }

    @Test
    public void DatenAendern()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Moritz Mustermann", "01.01.2000", "männlich", "Musterstraße 2", "012345");
        assertEquals("Patientenname erfolgreich geändert", anwendun1.PatientendatenAendern("Patientenname", "Moritz Mustermann", "Max Mustermann"));
        assertEquals("Geburtsdatum  erfolgreich geändert", anwendun1.PatientendatenAendern("Geburtsdatum", "Max Mustermann", "02.02.2000"));
        assertEquals("Geschlecht  erfolgreich geändert", anwendun1.PatientendatenAendern("Geschlecht", "Max Mustermann", "weiblich"));
        assertEquals("Adresse  erfolgreich geändert", anwendun1.PatientendatenAendern("Adresse", "Max Mustermann", "Musterstraße 1"));
        assertEquals("Telefonnummer erflogreich geändert", anwendun1.PatientendatenAendern("Telefonnummer", "Max Mustermann", "098765"));
    }

    @Test
    public void DatenAendern2()
    {
        Anwendung anwendun1 = new Anwendung();
        anwendun1.PatientHinzufuegen("Max Mustermann", "01.01.2000", "männlich", "Musterstraße 1", "098765432");
        assertEquals("falsche Eingabe", anwendun1.PatientendatenAendern("Alter", "Max Mustermann", "12"));
    }
}















