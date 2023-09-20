import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Mata en: Förnamn Efternamn Längd och Ålder");
        System.out.println("Lägg space efter ålder eller du inte snäll");
        String hela_skiten = tb.nextLine();
        int space = hela_skiten.indexOf(" ");

        String förnamn = hela_skiten.substring(0, space);
        space = hela_skiten.indexOf(" ",space+1);
        int mängd = förnamn.length();

        String eftenamn = hela_skiten.substring(mängd,space);
        space = hela_skiten.indexOf(" ",space+1);
        int mängd2 = eftenamn.length();

        String längd = hela_skiten.substring(mängd+mängd2,space);
        space = hela_skiten.indexOf(" ",space+1);
        int mängd3 = längd.length();

        String ålder = hela_skiten.substring(mängd+mängd2+mängd3,space);
        System.out.println("Du är "+ förnamn+ eftenamn+" och du är"+längd+" lång och"+ålder+" gammal");

      


    }
}
