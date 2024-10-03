public class MainProgram {
    public static void main(String[] args) {
        Employee e01 = new Employee("Müller", "Markus", "02.05.1990", 'm', 34, 78.4, "C12", 1500, 0, "Hat Montags frei!");
        Employee e02 = new Employee("Schneider", "Anna", "17.09.1996", 'f', 28, 67.2, "K34", 1500, 0, "Hat Freitags frei!");
        System.out.println(e01.getVorname() + " " + e01.getName() + "(" + e01.getGeschlecht() + ")" + ", geboren am " + e01.getGeburtsdatum() + " ist ein neuer Mitarbeiter in der Abteilung " + e01.getAbteilung() + ".");
        System.out.println(e01.getPerson() + "ist " + e01.getAlter() + " Jahre alt, wiegt " + e01.getGewicht() + " kg und startet mit einem Bruttogehalt von " + e01.getGehalt() + " Euro.");
        System.out.println(e01.getBesonderheiten());
        System.out.println(e02.getVorname() + " " + e02.getName() + "(" + e02.getGeschlecht() + ")"  + ", geboren am " + e02.getGeburtsdatum() + " ist ein neuer Mitarbeiter in der Abteilung " + e02.getAbteilung() + ".");
        System.out.println(e02.getPerson() + "ist " + e02.getAlter() + " Jahre alt, wiegt " + e02.getGewicht() + " kg und startet mit einem Bruttogehalt von " + e02.getGehalt() + " Euro.");
        System.out.println(e02.getBesonderheiten());
    }
}
