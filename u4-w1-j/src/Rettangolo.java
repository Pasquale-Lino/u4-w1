public class Rettangolo {
    // Attributi privati (incapsulamento)
    private double altezza;
    private double larghezza;

    // Costruttore
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Getter e Setter
    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        }
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        if (larghezza > 0) {
            this.larghezza = larghezza;
        }
    }

    // Metodo per calcolare l'area
    public double calcolaArea() {
        return altezza * larghezza;
    }

    // Metodo per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    // Metodo statico per stampare un rettangolo
    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Rettangolo:");
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
        System.out.println("-------------------------");
    }

    // Metodo statico per stampare due rettangoli
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("=== Primo rettangolo ===");
        stampaRettangolo(r1);

        System.out.println("=== Secondo rettangolo ===");
        stampaRettangolo(r2);

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("=== Somme ===");
        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }

    // Main per testare la classe
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 10);
        Rettangolo r2 = new Rettangolo(3, 7);

        // Stampo un solo rettangolo
        stampaRettangolo(r1);

        // Stampo due rettangoli e le somme
        stampaDueRettangoli(r1, r2);
    }
}
