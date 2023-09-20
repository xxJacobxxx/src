import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Mata en: Förnamn Efternamn Längd och Ålder");
        String hela_skiten = tb.nextLine();
        int mängd = hela_skiten.length();
        int space = hela_skiten.indexOf(" ");
        String förnamn = hela_skiten.substring(0, space);
        space = hela_skiten.indexOf(" ",space+1);
        String eftenamn = hela_skiten.substring(0,space);
        space = hela_skiten.indexOf(" ",space+1);
        String längd = hela_skiten.substring(0,space);
        space = hela_skiten.indexOf(" ",space+1);
        String ålder = hela_skiten.substring(0,space);
        System.out.println("Du är "+ förnamn+ " "+ eftenamn+" och du är "+längd+" lång och "+ålder+" gammal");


    }
}
