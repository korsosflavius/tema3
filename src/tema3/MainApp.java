package tema3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try {
            List<Parabola> parabole = new ArrayList<>();
            try {
                Scanner sc = new Scanner(new File("src/tema3/in.csv"));
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] coef = line.split(",");
                    int a = Integer.parseInt(coef[0]);
                    int b = Integer.parseInt(coef[1]);
                    int c = Integer.parseInt(coef[2]);
                    parabole.add(new Parabola(a, b, c));
                }
            } catch (FileNotFoundException e) {
                System.out.println("Fișierul nu a fost găsit: " + e.getMessage());
                return;
            } catch (NumberFormatException e) {
                System.out.println("Datele din fișier nu sunt valide: " + e.getMessage());
                return;
            }
            for (Parabola parabola : parabole) {
                float[] varf = parabola.getVarf();
                System.out.println(parabola);
                System.out.println("Coordonatele varfului parabolei sunt: ");
                System.out.println("xV = " + varf[0]);
                System.out.println("xV = " + varf[1]);
            }

            Parabola p1 = parabole.get(0);
            Parabola p2 = parabole.get(1);
            float[] mijloc = p1.Mijloc(p2);
            System.out.printf("Mijlocul segmentului dintre varfurile parabolelor este la coordonatele: xM = " + mijloc[0] + " ,yM= " + mijloc[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
