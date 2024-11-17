package tema4;

public abstract class Echipament {

    protected String denumire;
    protected int nr_inv;
    protected int pret;
    protected String zona_mag;
    protected  Situatie situatie;
    protected TIP tip;

    public Echipament(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie, TIP tip) {
        this.denumire = denumire;
        this.nr_inv=nr_inv;
        this.pret=pret;
        this.zona_mag=zona_mag;
        this.situatie=situatie;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public void setNr_inv(int nr_inv) {
        this.nr_inv = nr_inv;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getZona_mag() {
        return zona_mag;
    }

    public void setZona_mag(String zona_mag) {
        this.zona_mag = zona_mag;
    }

    public Situatie getSituatie() {
        return situatie;
    }

    public void setSituatie(Situatie situatie) {
        this.situatie = situatie;
    }

    public TIP getTip() {
        return tip;
    }

    public void setTip(TIP tip) {
        this.tip = tip;
    }

    @Override
    public String toString(){
        return "Echipament{" + denumire + ";" + nr_inv + ";" + pret + ";" + zona_mag + ";" + situatie + ", " + tip + ", ";
    }
    public abstract void  afiseaza_detalii();
}
