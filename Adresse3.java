package uebungen.uebungsblatt2;


public class Adresse3 {

    private String straße;
    private String hausnummer;
    private String ort;
    private int postleitzahl;

    public Adresse3(String straße, String hausnummer, String ort, int postleitzahl)
    {
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.postleitzahl = postleitzahl;
    }

    public String getStraße() {
        return straße;
    }

    public String getOrt() {
        return ort;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String toString() {

        return "Adresse" + "\n" + getStraße() + " " + getHausnummer() + "\n" + getPostleitzahl()
                + ", " + getOrt();
    }


}
