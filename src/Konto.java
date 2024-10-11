public class Konto {

    public static void main(String[] args) {
        Konto konto = new Konto("Max Mustermann");
        konto.einzahlen(100);
        konto.auszahlen(50);
        konto.auszahlen(100);
    }

    private double kontostand;
    private String kontoInhaber;
    private static int anzahlKonten;

    public Konto(String kontoInhaber) {
        anzahlKonten++;
        System.out.println("Konto erstellt");
    }

    public void einzahlen(double betrag) {
        kontostand += betrag;
        System.out.println("Einzahlung: " + betrag + "€");
        System.out.println("Kontostand: " + kontostand + "€");
    }

    public void auszahlen(double betrag) {
        if (kontostand - betrag < 0) {
            System.out.println("Kontostand reicht nicht aus");
        } else {
            kontostand -= betrag;
            System.out.println("Auszahlung: " + betrag + "€");
            System.out.println("Kontostand: " + kontostand + "€");
        }
    }

    public static int getAnzahlKonten() {
        return anzahlKonten;
    }

    public static void setAnzahlKonten(int anzahlKonten) {
        Konto.anzahlKonten = anzahlKonten;
    }
}
