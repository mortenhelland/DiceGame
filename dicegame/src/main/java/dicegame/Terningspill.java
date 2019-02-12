package dicegame;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class Terningspill {
    private Terningspill() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Kopp kopp = new Kopp();
        String a = kopp.trill();
        System.out.println(a);
    }

    public void leggTilSpiller() {
        Spiller[] spiller = null;
        Scanner scanner = new Scanner(System.in);
    }

    public void spill() {

    }
}
