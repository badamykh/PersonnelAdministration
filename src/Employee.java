public class Employee {
    private String name;
    private String vorname;
    private String geburtsdatum;
    private char geschlecht;
    private int alter;
    private double gewicht;
    private String abteilung = "A38";
    private double gehalt = 1500;
    private int dienstjahre = 0;
    private String besonderheiten;

    public Employee(String nach, String vor, String geburt, char gend, int alt, double kg, String ander) {
        name = nach;
        vorname = vor;
        geburtsdatum = geburt;
        geschlecht = gend;
        alter = alt;
        gewicht = kg;
        besonderheiten = ander;
    }

    public String getName() {
        return name;
    }
    public String getVorname() {
        return vorname;
    }
    public String getGeburtsdatum() {
        return geburtsdatum;
    }
    public char getGeschlecht() {
        return geschlecht;
    }
    public int getAlter() {
        return alter;
    }
    public double getGewicht() {
        return gewicht;
    }
    public String getAbteilung() {
        return abteilung;
    }
    public void setAbteilung(String neuAbteil) {
        abteilung = neuAbteil;
    }
    public double getGehalt() {
        return gehalt;
    }
    public String getBesonderheiten() {
        return besonderheiten;
    }
    public String getPerson() {
        if (geschlecht == 'm') {
            return "Er ";
        } else {
            return "Sie ";
        }
    }
}
