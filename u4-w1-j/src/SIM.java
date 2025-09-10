import java.util.ArrayList;

class SIM {
    private final String numeroTelefono;   // final perché non cambia mai
    private double credito;
    private final ArrayList<Chiamata> chiamate;  // final perché non viene mai riassegnata

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.chiamate = new ArrayList<>();
    }

    public void ricarica(double importo) {
        if (importo > 0) {
            credito += importo;
        }
    }

    public void aggiungiChiamata(Chiamata c) {
        if (chiamate.size() == 5) {
            chiamate.remove(0); // se passi a LinkedList -> chiamate.removeFirst();
        }
        chiamate.add(c);
    }

    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " €");
        System.out.println("Ultime chiamate:");
        if (chiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata c : chiamate) {
                System.out.println(" - " + c);
            }
        }
    }
}
