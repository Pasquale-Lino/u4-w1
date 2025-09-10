public class Main {
    public static void main(String[] args) {
        SIM miaSIM = new SIM("3331234567");

        // Ricarico la SIM
        miaSIM.ricarica(20);

        // Aggiungo alcune chiamate
        miaSIM.aggiungiChiamata(new Chiamata("3209876543", 3));
        miaSIM.aggiungiChiamata(new Chiamata("3456789012", 5));
        miaSIM.aggiungiChiamata(new Chiamata("3891122334", 2));
        miaSIM.aggiungiChiamata(new Chiamata("3925566778", 10));
        miaSIM.aggiungiChiamata(new Chiamata("3474455667", 1));
        miaSIM.aggiungiChiamata(new Chiamata("3501122334", 4)); // questa farà uscire la prima

        // Stampo i dati della SIM
        miaSIM.stampaDatiSIM();
    }
}