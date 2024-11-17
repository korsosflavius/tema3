package tema4;

public class SistemCalcul extends Echipament{
    private String tip_mon;
    private int c_hdd;
    private SO so;
    public SistemCalcul(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie, TIP tip, String tip_mon, int c_hdd, SO so) {
        super(denumire, nr_inv, pret, zona_mag, situatie, tip);
        this.tip_mon=tip_mon;
        this.c_hdd=c_hdd;
        this.so=so;
    }

    @Override
    public String toString(){
        return super.toString() + tip_mon + ", " + c_hdd + ", " + so;
    }

    @Override
    public void afiseaza_detalii() {
        this.toString();
    }
}
