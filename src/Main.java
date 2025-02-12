//Napišite program koji učitava niz znakova sa standardnog ulaza i ispisuje koliko ima slova,
// koliko brojeva i koliko "ostalih znakova".
// Npr. ako je uneseni niz znakova "Danas je 27.02.2010.", program treba ispisati:
//        Slova: 7
//        Brojevi: 8
//        Ostali znakovi: 5
//        Za znakove koristiti klasu Character (Character.isDigit)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi niz znakova: ");
        String nizZnakova = scan.nextLine();

        BrojanjeZnakova.brojanjeZnakova(nizZnakova);
    }
}