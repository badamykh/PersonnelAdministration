public class MainProgram {
    public static void main(String[] args) {
        Employee e01 = new Employee("Müller", "Markus", "02.05.1990", 'm', 34, 78.4, "Hat Montags frei!");
        Employee e02 = new Employee("Schneider", "Anna", "17.09.1996", 'f', 28, 67.2, "Hat Freitags frei!");
        Employee e03 = new Employee("Schäfer", "Joshua", "09.10.1998", 'm', 26, 72.4, "Hat Mittwochs frei!");
        Employee e04 = e01;

        e01.setAbteilung("C64");
        e02.setAbteilung("C64");

        System.out.println(e01.getVorname() + " " + e01.getName() + "(" + e01.getGeschlecht() + ")" + ", geboren am " + e01.getGeburtsdatum() + " ist ein neuer Mitarbeiter in der Abteilung " + e01.getAbteilung() + ".");
        System.out.println(e01.getPerson() + "ist " + e01.getAlter() + " Jahre alt, wiegt " + e01.getGewicht() + " kg und startet mit einem Bruttogehalt von " + e01.getGehalt() + " Euro.");
        System.out.println(e01.getBesonderheiten());

        System.out.println(e02.getVorname() + " " + e02.getName() + "(" + e02.getGeschlecht() + ")"  + ", geboren am " + e02.getGeburtsdatum() + " ist ein neuer Mitarbeiter in der Abteilung " + e02.getAbteilung() + ".");
        System.out.println(e02.getPerson() + "ist " + e02.getAlter() + " Jahre alt, wiegt " + e02.getGewicht() + " kg und startet mit einem Bruttogehalt von " + e02.getGehalt() + " Euro.");
        System.out.println(e02.getBesonderheiten());

        System.out.println(e03.getVorname() + " " + e03.getName() + "(" + e03.getGeschlecht() + ")"  + ", geboren am " + e03.getGeburtsdatum() + " ist ein neuer Mitarbeiter in der Abteilung " + e03.getAbteilung() + ".");
        System.out.println(e03.getPerson() + "ist " + e03.getAlter() + " Jahre alt, wiegt " + e03.getGewicht() + " kg und startet mit einem Bruttogehalt von " + e03.getGehalt() + " Euro.");
        System.out.println(e03.getBesonderheiten());

        System.out.println(e04.getVorname() + " " + e04.getName() + "(" + e04.getGeschlecht() + ")"  + ", geboren am " + e04.getGeburtsdatum() + " ist ein neuer Mitarbeiter in der Abteilung " + e04.getAbteilung() + ".");
        System.out.println(e04.getPerson() + "ist " + e04.getAlter() + " Jahre alt, wiegt " + e04.getGewicht() + " kg und startet mit einem Bruttogehalt von " + e04.getGehalt() + " Euro.");
        System.out.println(e04.getBesonderheiten());
    }
}
