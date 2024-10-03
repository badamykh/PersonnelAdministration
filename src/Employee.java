public class Employee {
    private String name;
    private String vorname;
    private String geburtsdatum;
    private char geschlecht;
    private int alter;
    private double gewicht;
    private String abteilung;
    private double gehalt;
    private int dienstjahre;
    private String besonderheiten;

    public Employee(String nach, String vor, String geburt, char gend, int alt, double kg, String ab, double geld, int dienst, String ander) {
        name = nach;
        vorname = vor;
        geburtsdatum = geburt;
        geschlecht = gend;
        alter = alt;
        gewicht = kg;
        abteilung = ab;
        gehalt = geld;
        dienstjahre = dienst;
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
