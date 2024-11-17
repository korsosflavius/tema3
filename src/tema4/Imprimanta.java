package tema4;

public class Imprimanta extends Echipament {

    private int ppm;
    private String rez;
    private int p_car;
    private ModTiparire mod_tip;
    public Imprimanta(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie, TIP tip, int ppm, String rez, int p_car, ModTiparire mod_tip) {
        super(denumire, nr_inv, pret, zona_mag, situatie, tip);
        this.ppm=ppm;
        this.rez=rez;
        this.p_car=p_car;
        this.mod_tip=mod_tip;
    }
    @Override
    public String toString(){
            return super.toString() + ", " + ppm + ", " + rez + ", " + p_car + ", " + mod_tip;
    }

    @Override
    public void afiseaza_detalii() {
        this.toString();
    }
}
