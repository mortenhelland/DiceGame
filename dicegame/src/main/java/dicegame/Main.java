package dicegame;

public class Main {

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Terningspill terningspill = new Terningspill();
        Kopp kopp = new Kopp();
        System.out.println(kopp.trill());    
        System.out.println(kopp.getSum());
    }
}
