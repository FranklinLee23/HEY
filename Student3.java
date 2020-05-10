package uebungen.uebungsblatt2;


public class Student3 {

    private String vollstaendiger_Name;
    private String telefonnummer;
    private String sprache;
    private Adresse3 adr3;
    private Studiengruppe studiengruppe;

    public Student3(String vollstaendiger_Name,String telefonnummer,String sprache,Studiengruppe studiengruppe)
    {
        this.vollstaendiger_Name = vollstaendiger_Name;
        this.telefonnummer = telefonnummer;
        this.sprache = sprache;
	this.studiengruppe = studiengruppe;
    }

    public Student3(String vollstaendiger_Name, String telefonnummer, String sprache, Studiengruppe studiengruppe, String straße, String hausnummer,Ort ort, int                      postleitzahl)
    {
        this(vollstaendiger_Name,telefonnummer,sprache,studiengruppe);
        adr3 = new Adresse3(straße,hausnummer,ort.toString(),postleitzahl);
    }

    public Studiengruppe getStudiengruppe()
	{
		return studiengruppe;
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

    public String getSprache() {
        return sprache;
    }

    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    public Adresse3 getAdr3() {
        return adr3;
    }

    public void setAdr3(Adresse3 adr3) {
        this.adr3 = adr3;
    }

     public String getDetails()
    {
        if(sprache.equals("ES"))
        {
            if(adr3!=null)
            {

                String s = "Name:\n"+ getVollstaendiger_Name() + "\n" + "N\u00FAmero de tel\u00E9fono: " + getTelefonnummer() + "\n" + "Studiengruppe:" + "\n" +                 studiengruppe.toString() + "\n" + adr3.toString();
                return s;
            }
            else
            {
                String s = "Name:" + "\n" + getVollstaendiger_Name() + "\n" + "N\u00FAmero de tel\u00E9fono: " + getTelefonnummer() + "\n" + "Studiengruppe:" + "\n" +                             studiengruppe.toString();
                return s;
            }
        }
        else
        {
            if(adr3!=null)
            {
                return "Name:" + "\n" + getVollstaendiger_Name() + "\n" + "Telefonnummer: " + getTelefonnummer() + "\n" + "Studiengruppe:" + "\n" +                         studiengruppe.toString() + "\n" + adr3.toString();
            }
            else
            {
                String s = "Name:" + "\n" + getVollstaendiger_Name() + "\n" + "Telefonnummer: " + getTelefonnummer() + "\n" + "Studiengruppe:" + "\n" +                            studiengruppe.toString();
                return s;
            }
        }
    }
}
