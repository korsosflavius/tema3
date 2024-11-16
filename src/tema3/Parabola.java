package tema3;

class Parabola {
    private final int a;
    private final int b;
    private final int c;
    public Parabola(int a, int b, int c){
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public float[] getVarf() {
        if (a == 0) {
            throw new IllegalArgumentException("Coeficientul 'a' nu poate fi zero pentru o parabola.");
        }
        float xV = (float) -b / (2 * a);
        float yV = (float) (-(b*b)+4*a*c)/(4*a);

        return new float[]{xV,yV};
    }
    public float[] Mijloc(Parabola altaParabola) {

        float[] varf1 = this.getVarf();
        float[] varf2 = altaParabola.getVarf();

        float xM = (varf1[0] + varf2[0]) / 2;
        float yM = (varf1[1] + varf2[1]) / 2;

        return new float[]{xM, yM};
    }
    @Override
    public String toString(){
        StringBuilder fc = new StringBuilder("f(x) = ");
        if (a != 0)
            fc.append(a).append("x^2");
        if (b > 0)
            fc.append(" + ").append(b).append("x");
        else
            fc.append(" - ").append(Math.abs(b)).append("x");
        if (c > 0)
            fc.append(" + ").append(c);
        else
            fc.append(" - ").append(Math.abs(c));
        return fc.toString();
    }
}
