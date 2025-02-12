public class BrojanjeZnakova {
    public static void brojanjeZnakova(String tekst) {

        int slovo = 0;
        int broj = 0;
        int ostalo = 0;

        for (char x : tekst.toCharArray()) {
            if (Character.isLetter(x)) {
                slovo++;
            } else if (Character.isDigit(x)) {
                broj++;
            } else {
                ostalo++;

            }
        }
        System.out.println("Slova: " + slovo + "\nBrojevi: " + broj + "\nOstali znakovi: " + ostalo);
    }
}
