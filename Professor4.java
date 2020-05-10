package uebungen.uebungsblatt2;


public class Professor4 implements Person
 {

    private String vollstaendiger_Name;
    private String telefonnummer;
    private Adresse4 adr4;
    private String fakultaet;

    public Professor4(String vollstaendiger_Name,String telefonnummer, String fakultaet)
    {
        this.vollstaendiger_Name = vollstaendiger_Name;
        this.telefonnummer = telefonnummer;
	this.fakultaet = fakultaet;
    }

    public Professor4(String vollstaendiger_Name, String telefonnummer, String fakultaet, String straße, String hausnummer,Ort ort, int postleitzahl)
    {
        this.vollstaendiger_Name = vollstaendiger_Name;
        this.telefonnummer = telefonnummer;
	this.fakultaet = fakultaet;
        adr4 = new Adresse4(straße,hausnummer,ort.toString(),postleitzahl);
    }

	public String getFakultaet()
	{
		return fakultaet;
	}

	public void setFakultaet(String s)
	{
		fakultaet = s;
	}

    public String getVollstaendiger_Name() {
        return vollstaendiger_Name;
    }

    public void setVollstaendiger_Name(String vollstaendiger_Name) {
        this.vollstaendiger_Name = vollstaendiger_Name;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }


    public Adresse4 getAdr4() {
        return adr4;
    }

    public void setAdr4(Adresse4 adr4) {
        this.adr4 = adr4;
    }

     public String getDetails()
    {
            if(adr4!=null)
            {
                return "Name:" + "\n" + getVollstaendiger_Name() + "\n" + "Telefonnummer: " + getTelefonnummer() + "\n" + "Fakultaet:" + "\n" + this.getFakultaet() + "\n" + adr4.toString();
            }
            else
            {
                String s = "Name:" + "\n" + getVollstaendiger_Name() + "\n" + "Telefonnummer: " + getTelefonnummer() + "\n" + "Fakultaet" + "\n" + this.getFakultaet();
                return s;
            }
    }

	public String getAssignment()
	{	
		String s = "Name:" + "\n" + getVollstaendiger_Name() + "\n";

		if(fakultaet == null)                                                        // kein equals, weil wenn fakultaet null dann nullpointerexeption
		{
			 return s + "Fakultaet: keine vorhanden";
		}
		else
		{
			 return s + "Fakultaet:" + "\n" + this.getFakultaet();
		}
                
	}
}
