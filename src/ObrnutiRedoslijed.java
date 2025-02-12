//Napišite program u Javi koji će učitati niz znakova (string)
//sa standardnog ulaza i okrenuti redoslijed riječi u unesenom stringu.
//Prikazati transformirani string s obrnutim redoslijedom riječi.
//Primjer ulaza: Dobar dan svima
//Primjer izlaza: svima dan Doba

import java.util.Scanner;

public class ObrnutiRedoslijed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi niz rijeci koje zelis dobiti u obrnutom redosijedu: ");
        String nizRijeci = scan.nextLine();

        ObrnutiRedMetoda.obrnutiRed(nizRijeci);
    }
}