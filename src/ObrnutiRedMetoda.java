public class ObrnutiRedMetoda {
    public static void obrnutiRed(String tekst) {

        tekst = tekst.trim();
        String[] nizRijeciTemp = tekst.split(" ");
        System.out.println("Obrnuti redoslijed rijeci: ");

        for (int i = nizRijeciTemp.length - 1; i >= 0; i--) {
            System.out.print(nizRijeciTemp[i] + " ");

        }
    }
}
