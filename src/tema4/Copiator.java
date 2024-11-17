package tema4;

public class Copiator extends Echipament {

    private int p_ton;
    private Format format;

    public Copiator(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie, TIP tip, int p_ton, Format format) {
        super(denumire, nr_inv, pret, zona_mag, situatie, tip);
        this.p_ton = p_ton;
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + p_ton + ", " + format;
    }

    @Override
    public void afiseaza_detalii() {
        this.toString();
    }
}
