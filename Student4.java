package uebungen.uebungsblatt2;


public class Student4 implements Person
{

    private String vollstaendiger_Name;
    private String telefonnummer;
    private Adresse4 adr4;
    private Studiengruppe studiengruppe;

    public Student4(String vollstaendiger_Name,String telefonnummer, Studiengruppe studiengruppe)
    {
        this.vollstaendiger_Name = vollstaendiger_Name;
        this.telefonnummer = telefonnummer;
	this.studiengruppe = studiengruppe;
    }

    public Student4(String vollstaendiger_Name, String telefonnummer, Studiengruppe studiengruppe, String straße, String hausnummer,Ort ort, int postleitzahl)
    {
        this(vollstaendiger_Name,telefonnummer,studiengruppe);
	String ort_String = ort.toString();
        adr4 = new Adresse4(straße,hausnummer,ort_String,postleitzahl);
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
                return "Name:" + "\n" + getVollstaendiger_Name() + "\n" + "Telefonnummer: " + getTelefonnummer() + "\n" + "Studiengruppe:" + "\n" +                         studiengruppe.toString() + "\n" + adr4.toString();
            }
            else
            {
                String s = "Name:" + "\n" + getVollstaendiger_Name() + "\n" + "Telefonnummer: " + getTelefonnummer() + "\n" + "Studiengruppe:" + "\n" +                             studiengruppe.toString();
                return s;
            }
    }

	public String getAssignment()
	{
		String s = "Name:" + "\n" + getVollstaendiger_Name() + "\n";

		if(studiengruppe == null)
		{	
                        return s + "Studiengruppe: keine vorhanden";
		}
		else
		{
		        return s + "Studiengruppe:" + "\n" + studiengruppe.toString();
		}
               
	}
}
