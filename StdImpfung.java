
/**
 * Beschreiben Sie hier die Klasse StdImpfung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StdImpfung
{
    

    protected String Impfname;
    protected String Information;
    public int Abstand;
    public int letzteImpfung;
    public int Impfstatus;

    public StdImpfung()
    {
        this.Impfname=Impfname;
        this.Information= Information;
        this.Abstand= Abstand;
        this.Impfstatus=Impfstatus;
    }

    public String getInformation()
    {
        HepatitisA InfosA = new HepatitisA();
        String a=InfosA.getInfo();
        HepatitisB InfosB=new HepatitisB();        
        String a1=InfosB.getInfo();

        System.out.println("Information HepatitisA: " + a);
        System.out.println("Information HepatitisB: " + a1);
        return a+a1;
    }

    public String getName()
    {
        HepatitisA NameA=new HepatitisA();
        String b=NameA.getName();
        HepatitisB NameB=new HepatitisB();
        String b1=NameB.getName();
        
        System.out.println("Impfname: " + b);
        System.out.println("Impfname: " + b1);
        return b+b1;
    }

    
    
    
    
    
    
}
