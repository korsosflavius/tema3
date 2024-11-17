
package tema4;

import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Echipament> echipamente = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("src/tema4/echipamente.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] coef = line.split(";");
                String denumire = coef[0].trim();
                int nr_inv = Integer.parseInt(coef[1].trim());
                int pret = Integer.parseInt(coef[2].trim());
                String zona_mag = coef[3].trim();
                Situatie situatie = Situatie.valueOf(coef[4].trim().toUpperCase());
                TIP tip = TIP.valueOf(coef[5].trim());

                if (tip==TIP.COPIATOR) {
                    int p_ton = Integer.parseInt(coef[6].trim());
                    Format format = Format.valueOf(coef[7].trim().toUpperCase());
                    echipamente.add(new Copiator(denumire, nr_inv, pret, zona_mag, situatie, tip, p_ton, format));
                } else if (tip==TIP.IMPRIMANTA) {
                    int ppm = Integer.parseInt(coef[6].trim());
                    String rez = coef[7].trim();
                    int p_car = Integer.parseInt(coef[8].trim());
                    ModTiparire mod_tip = ModTiparire.valueOf(coef[9].trim());
                    echipamente.add(new Imprimanta(denumire, nr_inv, pret, zona_mag, situatie, tip, ppm, rez, p_car, mod_tip));
                } else {
                    String tip_mon = coef[5].trim();
                    int c_hdd = Integer.parseInt(coef[7].trim());
                    SO so = SO.valueOf(coef[8].trim().toUpperCase());
                    echipamente.add(new SistemCalcul(denumire, nr_inv, pret, zona_mag, situatie, tip, tip_mon, c_hdd, so));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Eroare la citirea datelor: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        int opt;
        do {
            System.out.println("\nMeniu:");
            System.out.println("1. Afișeaza toate echipamentele");
            System.out.println("2. Afișeaza imprimantele");
            System.out.println("3. Afișeaza copiatoarele");
            System.out.println("4. Afișeazs sistemele de calcul");
            System.out.println("5. Modifica starea unui echipament");
            System.out.println("6. Seteaza modul de tiparire pentru imprimanta");
            System.out.println("7. Seteaza formatul de copiere pentru COPIATOR");
            System.out.println("8. Instaleaza sistem de operare pe un sistem de calcul");
            System.out.println("9. Iesi");
            System.out.print("Alegeti opțiunea: ");

            opt = scanner.nextInt();

            switch (opt) {
                case 1 -> {
                    System.out.println("Toate echipamentele:");
                    for (Echipament echipament : echipamente) {
                        System.out.println(echipament.getDenumire());
                    }
                }
                case 2 -> {
                    System.out.println("Imprimante:");
                    for (Echipament echipament : echipamente) {
                        if (echipament instanceof Imprimanta) {
                            System.out.println(echipament.getDenumire());
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Copiatoare:");
                    for (Echipament echipament : echipamente) {
                        if (echipament instanceof Copiator) {
                            System.out.println(echipament.getDenumire());
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Sisteme Calcul:");
                    for (Echipament echipament : echipamente) {
                        if (echipament instanceof SistemCalcul) {
                            System.out.println(echipament.getDenumire());
                        }
                    }
                }
            }
        }
        while (opt != 9);
    }

}